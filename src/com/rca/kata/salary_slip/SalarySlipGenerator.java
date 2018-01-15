package com.rca.kata.salary_slip;

public class SalarySlipGenerator {
    public SalarySlip generateFor(Employee employee){
        double grossSalary = employee.getAnnualGrossSalary()/12;
        return new SalarySlip(employee,grossSalary);
    }
}
