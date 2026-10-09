
package model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private int id;
    private String name;
    private Employee manager;
    private List<Employee> employees;

    public Department(int id, String name,
                      Employee manager,
                      List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.employees = new ArrayList<>();

        if (employees != null) {
            for (Employee employee : employees) {
                addEmployee(employee);
            }
        }

        if (manager != null) {
            manager.setDepartment(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;

        if (manager != null) {
            manager.setDepartment(this);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void setEmployees(List<Employee> employees) {
        for (Employee employee :
                new ArrayList<>(this.employees)) {
            removeEmployee(employee.getId());
        }

        if (employees != null) {
            for (Employee employee : employees) {
                addEmployee(employee);
            }
        }
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            return;
        }

        Employee existing = findEmployee(employee.getId());

        if (existing != null) {
            return;
        }

        Department oldDepartment = employee.getDepartment();

        if (oldDepartment != null && oldDepartment != this) {
            oldDepartment.removeEmployee(employee.getId());
        }

        employees.add(employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(int employeeId) {
        Employee employee = findEmployee(employeeId);

        if (employee != null) {
            employees.remove(employee);

            if (employee.getDepartment() == this) {
                employee.setDepartment(null);
            }

            if (manager == employee) {
                manager = null;
            }
        }
    }

    public Employee findEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                return employee;
            }
        }

        return null;
    }

    public double calculateTotalPayroll() {
        double total = 0;

        for (Employee employee : employees) {
            total += employee.calculateSalary();
        }

        return total;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return "Department ID: " + id
                + ", Name: " + name
                + ", Employees Count: " + employees.size()
                + ", Manager: "
                + (manager == null
                   ? "Not assigned" : manager.getName());
    }
}