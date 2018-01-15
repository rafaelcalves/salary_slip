package com.rca.kata.salary_slip;

public class SalarySlip {
    private Employee employee;
    private double grossSalary;
    private double nationalInsuranceContributions;

    public SalarySlip(Employee employee, double grossSalary) {
        this.employee = employee;
        this.grossSalary = grossSalary;
        this.nationalInsuranceContributions = 0;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNationalInsuranceContributions() {
        return nationalInsuranceContributions;
    }
}
