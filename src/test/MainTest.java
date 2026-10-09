
package test;

import model.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {

        CommissionEmployee employee =
                new CommissionEmployee(
                        10,
                        "Sara",
                        Gender.FEMALE,
                        LocalDate.of(2025, 1, 1),
                        4000,
                        5,
                        10000
                );

        Department department = new Department(
                201,
                "Sales",
                employee,
                new ArrayList<>()
        );

        department.addEmployee(employee);

        System.out.println(employee);
        System.out.println(
                "Salary: " + employee.calculateSalary()
        );

        System.out.println(
                "Total Payroll: "
                + department.calculateTotalPayroll()
        );
    }
}