package com.rca.kata.salary_slip;

import org.junit.Before;
import org.junit.Test;

public class SalarySlipGeneratorTest {

    SalarySlipGenerator salarySlipGenerator;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        salarySlipGenerator = new SalarySlipGenerator();
        employee = new Employee("",0);
    }

    @Test
    public void tryToExecuteGenerateFor() throws Exception {
        salarySlipGenerator.generateFor(employee);
    }
}
