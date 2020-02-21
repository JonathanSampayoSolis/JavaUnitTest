package com.sampa.unit.junit;

import com.sampa.unit.Math;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class ParameterizedTestFields {

    private Math math;

    @Parameter
    public int param1;

    @Parameter(1)
    public int param2;

    @Parameter(2)
    public int param3;

    /*
      Instead can inject params by constructor
     */
//    public ParameterizedTestFields(int param1, int param2, int param3) {
//        this.param1 = param1;
//        this.param2 = param2;
//        this.param3 = param3;
//    }

    @Parameters
    public static Collection<Object[]> loadParams() {
        Object[][] data = new Object[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        this.math = new Math();
    }

    @After
    public void tearDown() {
        this.math = null;
    }

    @Test
    public void testMultiplyByParameters() {
        Assert.assertEquals(this.param3, math.multiply(param1, param2));
    }

}
