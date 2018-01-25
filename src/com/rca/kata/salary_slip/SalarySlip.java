package com.rca.kata.salary_slip;

public class SalarySlip {
    private Employee employee;
    private double grossSalary;
    private double nationalInsuranceContributions;
    private double taxFreeAllowance;
    private double taxableIncome;
    private double taxPayable;

    public SalarySlip(Employee employee, double grossSalary, double nationalInsuranceContributions, double taxFreeAllowance, double taxableIncome, double taxPayable) {
        this.employee = employee;
        this.grossSalary = grossSalary;
        this.nationalInsuranceContributions = nationalInsuranceContributions;
        this.taxFreeAllowance = taxFreeAllowance;
        this.taxableIncome = taxableIncome;
        this.taxPayable = taxPayable;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNationalInsuranceContributions() {
        return nationalInsuranceContributions;
    }

    public double getTaxPayable() {
        return taxPayable;
    }

    public double getTaxFreeAllowance() {
        return taxFreeAllowance;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }
}
