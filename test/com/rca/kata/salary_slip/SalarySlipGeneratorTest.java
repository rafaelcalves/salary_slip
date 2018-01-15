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
        employee = new Employee(12345,"John J Doe",5000);
    }

    @Test
    public void whenAnualSalEqualsTo5000_grossSalEqualsTo416dot67() throws Exception {
        salarySlip = salarySlipGenerator.generateFor(employee);
        assertEquals(416.67,salarySlip.getGrossSalary());
    }
}
