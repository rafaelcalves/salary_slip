package com.rca.kata.salary_slip;

public class SalarySlipGenerator {
    private Employee employee;
    private double grossSalary = 0;
    private double nationalInsuranceContributions = 0;
    private double taxFreeAllowance = 0;
    private double taxableIncome = 0;
    private double taxPayable = 0;

    public SalarySlip generateFor(Employee employee){
        this.employee = employee;
        calculateMonthlyGrossSalary();
        calculateNationalInsuranceContributions();
        calculateTaxes();
        return new SalarySlip(
            this.employee,
            grossSalary,
            nationalInsuranceContributions,
            taxFreeAllowance,
            taxableIncome,
            taxPayable
        );
    }

    private void calculateNationalInsuranceContributions(){
        if(employee.getAnnualGrossSalary() > 8060){
            nationalInsuranceContributions =  (employee.getAnnualGrossSalary() - 8060)/12*.12;
        }
    }

    private void calculateMonthlyGrossSalary(){
        grossSalary = employee.getAnnualGrossSalary()/12;
    }

    private void calculateTaxes(){
        if(employee.getAnnualGrossSalary() > 11000){
            double amountAbove = employee.getAnnualGrossSalary() - 11000;
            taxFreeAllowance = 11000.0/12;
            taxableIncome = amountAbove/12;
            taxPayable = (amountAbove/12*.2);
        }
    }
}
