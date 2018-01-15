package com.rca.kata.salary_slip;

import org.junit.Before;
import org.junit.Test;

public class SalarySlipGeneratorTest {

    SalarySlipGenerator salarySlipGenerator;

    @Before
    public void setUp() throws Exception {
        salarySlipGenerator = new SalarySlipGenerator();
    }

    @Test
    public void tryToExecuteGenerateFor() throws Exception {
        salarySlipGenerator.generateFor();
    }
}
