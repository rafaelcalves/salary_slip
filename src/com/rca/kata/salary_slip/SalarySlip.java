package com.rca.kata.salary_slip;

public class SalarySlip {
    private Employee employee;
    private double grossSalary;

    public SalarySlip(Employee employee, double grossSalary) {
        this.employee = employee;
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }
}
