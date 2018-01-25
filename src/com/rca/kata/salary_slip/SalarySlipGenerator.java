package com.rca.kata.salary_slip;

public class SalarySlipGenerator {
    public static final double MINIMUM_AMOUNT_FOR_NI = 8060.0;
    public static final double TAX_FOR_MINIMUM_NI = .12;
    public static final int NUMBER_OF_MONTHS = 12;
    public static final double MINIMUM_AMOUNT_TO_BE_TAXED = 11000.0;
    public static final double TAX_FOR_MINIMUM_TO_BE_TAXED = .2;

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
        if(employee.getAnnualGrossSalary() > MINIMUM_AMOUNT_FOR_NI){
            nationalInsuranceContributions =  (employee.getAnnualGrossSalary() - MINIMUM_AMOUNT_FOR_NI)/ NUMBER_OF_MONTHS * TAX_FOR_MINIMUM_NI;
        }
    }

    private void calculateMonthlyGrossSalary(){
        grossSalary = employee.getAnnualGrossSalary()/NUMBER_OF_MONTHS;
    }

    private void calculateTaxes(){
        if(employee.getAnnualGrossSalary() > MINIMUM_AMOUNT_TO_BE_TAXED){
            double amountAbove = employee.getAnnualGrossSalary() - MINIMUM_AMOUNT_TO_BE_TAXED;
            taxFreeAllowance = MINIMUM_AMOUNT_TO_BE_TAXED/NUMBER_OF_MONTHS;
            taxableIncome = amountAbove/NUMBER_OF_MONTHS;
            taxPayable = (taxableIncome* TAX_FOR_MINIMUM_TO_BE_TAXED);
        }
    }
}
