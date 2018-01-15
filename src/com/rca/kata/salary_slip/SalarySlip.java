package com.rca.kata.salary_slip;

public class SalarySlip {
    private Employee employee;
    private double grossSalary;
    private double nationalInsuranceContributions;

    public SalarySlip(Employee employee, double grossSalary) {
        this.employee = employee;
        this.grossSalary = grossSalary;
        calculateNationalInsuranceContributions();
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNationalInsuranceContributions() {
        return nationalInsuranceContributions;
    }

    private void calculateNationalInsuranceContributions(){
        if(employee.getAnnualGrossSalary() > 8060){
            nationalInsuranceContributions = (employee.getAnnualGrossSalary() - 8060)/12*.12;
        } else {
            nationalInsuranceContributions = 0;
        }
    }
}
