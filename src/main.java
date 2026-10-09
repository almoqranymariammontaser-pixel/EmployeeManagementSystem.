
import model.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        // Create the monthly employee
        MonthlyEmployee monthly = new MonthlyEmployee(
                1, "Ahmed", Gender.MALE,
                LocalDate.of(2024, 1, 10),
                10000, 25, 10, true
        );

        // Create the hourly employee
        HourlyEmployee hourly = new HourlyEmployee(
                2, "Mona", Gender.FEMALE,
                LocalDate.of(2025, 3, 15),
                100, 45, 150
        );

        // Create the commission employee
        CommissionEmployee commission = new CommissionEmployee(
                3, "Omar", Gender.MALE,
                LocalDate.of(2023, 6, 1),
                5000, 5, 20000
        );

        // Create the department
        Department department = new Department(
                101,
                "IT Department",
                monthly,
                new ArrayList<>()
        );

        // Add employees to the department
        department.addEmployee(monthly);
        department.addEmployee(hourly);
        department.addEmployee(commission);

        // Print employee information
        System.out.println("=== All Employees ===");
        department.printAllEmployees();

        // Print salaries
        System.out.println("\n=== Salaries ===");
        System.out.println(
                monthly.getName() + ": "
                + monthly.calculateSalary()
        );

        System.out.println(
                hourly.getName() + ": "
                + hourly.calculateSalary()
        );

        System.out.println(
                commission.getName() + ": "
                + commission.calculateSalary()
        );

        // Print department information
        System.out.println("\n=== Department ===");
        System.out.println(department);

        System.out.println(
                "Total Payroll: "
                + department.calculateTotalPayroll()
        );

        // Search for an employee
        System.out.println("\n=== Search ===");
        Employee found = department.findEmployee(2);

        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Employee not found.");
        }

        // Remove an employee
        department.removeEmployee(3);

        System.out.println("\n=== After Removing Omar ===");
        department.printAllEmployees();

        System.out.println(
                "Updated Payroll: "
                + department.calculateTotalPayroll()
        );
    }
}