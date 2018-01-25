package com.rca.kata.salary_slip;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalarySlipGeneratorTest {

    SalarySlipGenerator salarySlipGenerator;
    Employee employee;
    SalarySlip salarySlip;

    @Before
    public void setUp() throws Exception {
        salarySlipGenerator = new SalarySlipGenerator();
    }

    @Test
    public void whenAnnualSalEqualsTo5000_GrossSalEqualsTo416dot67() throws Exception {
        setEmployee(12345,"John J Doe",5000);
        assertEquals(416.67,salarySlip.getGrossSalary(),.01);
    }

    @Test
    public void whenAnnualSalEqualsTo9060_NationalInsuranceEqualsTo10() throws Exception {
        setEmployee(12345,"John J Doe", 9060);
        assertEquals(10.00,salarySlip.getNationalInsuranceContributions(), .01);
    }

    @Test
    public void whenAnnualSalBiggerThan12000_TaxFreeAllowanceEqualsTo916dot67() throws Exception{
        setEmployee(12345,"John J Doe", 12000);
        assertEquals(916.67,salarySlip.getTaxFreeAllowance(),.01);
    }

    @Test
    public void whenAnnualSalBiggerThan12000_TaxableIncomeEqualsTo83dot33() throws Exception{
        setEmployee(12345,"John J Doe", 12000);
        assertEquals(83.33,salarySlip.getTaxableIncome(),.01);
    }
    @Test
    public void whenAnnualSalBiggerThan12000_TaxPayableEqualsTo16dot67() throws Exception{
        setEmployee(12345,"John J Doe", 12000);
        assertEquals(16.67,salarySlip.getTaxPayable(),.01);
    }

    private void setEmployee(int id, String name, double annualGrossSalary){
        employee = new Employee(id,name,annualGrossSalary);
        salarySlip = salarySlipGenerator.generateFor(employee);
    }
}
