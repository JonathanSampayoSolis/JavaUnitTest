package com.sampa.unit.junit;

import org.junit.Assert;
import org.junit.Test;

public class SomeTests {

    @Test
    public void onePlusTwoShouldGetThree() {
        Assert.assertEquals(3, 2 + 1);
    }

}
