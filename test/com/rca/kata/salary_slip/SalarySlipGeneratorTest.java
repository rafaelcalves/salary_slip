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
    public void whenAnualSalEqualsTo5000_GrossSalEqualsTo416dot67() throws Exception {
        employee = new Employee(12345,"John J Doe",5000);
        salarySlip = salarySlipGenerator.generateFor(employee);
        assertEquals(416.67,salarySlip.getGrossSalary(),0.01);
    }

    @Test
    public void whenAnualSalEqualsTo9060_NationalInsuranceEqualsTo10() throws Exception {
        employee = new Employee(12345,"John J Doe", 9060);
        salarySlip = salarySlipGenerator.generateFor(employee);
        assertEquals(10.00,salarySlip.getNationalInsuranceContributions(), 0.01);
    }
}
