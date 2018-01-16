package com.rca.kata.salary_slip;

public class SalarySlipGenerator {
    public SalarySlip generateFor(Employee employee){
        return new SalarySlip(
            employee,
            calculateMonthlyGrossSalary(employee),
            calculateNationalInsuranceContributions(employee)
        );
    }

    private double calculateNationalInsuranceContributions(Employee employee){
        if(employee.getAnnualGrossSalary() > 8060){
            return (employee.getAnnualGrossSalary() - 8060)/12*.12;
        } else {
            return 0;
        }
    }

    private double calculateMonthlyGrossSalary(Employee employee){
        return employee.getAnnualGrossSalary()/12;
    }
}
