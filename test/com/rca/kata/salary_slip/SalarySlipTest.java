package com.rca.kata.salary_slip;

import org.junit.Before;
import org.junit.Test;

public class SalarySlipTest {

    SalarySlip salarySlip;

    @Before
    public void setUp() throws Exception {
        salarySlip = new SalarySlip();
    }

    @Test
    public void tryToExecuteGenerateFor() throws Exception {
        salarySlip.generateFor();
    }
}
