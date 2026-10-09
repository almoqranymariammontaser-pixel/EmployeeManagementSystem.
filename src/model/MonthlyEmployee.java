
package model;

import java.time.LocalDate;

public class MonthlyEmployee extends Employee {

    private double monthlySalary;
    private int vacationDays;
    private double bonusPercentage;
    private boolean hasHealthInsurance;

    public MonthlyEmployee(
            int id, String name, Gender gender,
            LocalDate hireDate, double monthlySalary,
            int vacationDays, double bonusPercentage,
            boolean hasHealthInsurance) {

        super(id, name, gender, hireDate);

        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonusPercentage = bonusPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }

    public void setHasHealthInsurance(
            boolean hasHealthInsurance) {
        this.hasHealthInsurance = hasHealthInsurance;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary
                + (monthlySalary * bonusPercentage / 100.0);
    }

    public int calculateAdditionalVacation() {
        return Math.max(0, (vacationDays - 21) / 5);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Monthly Salary: " + monthlySalary
                + ", Vacation Days: " + vacationDays
                + ", Bonus: " + bonusPercentage + "%"
                + ", Health Insurance: "
                + hasHealthInsurance;
    }
}