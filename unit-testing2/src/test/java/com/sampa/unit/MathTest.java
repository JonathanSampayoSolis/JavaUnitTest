package com.sampa.unit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathTest {

    private Math math;

    /**
     * Executes before every test method
     */
    @BeforeMethod
    public void setUp() {
        math = new Math();
    }

    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
        // Arrange
        final int expected = 4;

        // Act
        final int actual = math.add(2, 2);

        // Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add_Positive_Plus_Negative() {
        // Arrange
        final int expected = -0;

        // Act
        final int actual = math.add(3, -3);

        // Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add_Negative_Plus_Negative() {
        // Arrange
        final int expected = -10;

        // Act
        final int actual = math.add(-5, -5);

        // Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void multiply_Two_Times_Three() {
        // Arrange
        final int expected = 10;

        // Act
        final int actual = math.multiply(2, 5);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiply_Ten_Times_Zero() {
        // Arrange
        final int expected = 0;

        // Act
        final int actual = math.multiply(10, 0);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;

        final double actual = math.divide(10, 5);

        Assert.assertEquals(actual, expected);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        math.divide(10, 0);
    }

    @Test
    public void divide_TenByTwo_ReturnsFive() {
        final double expected = 5;

        final double actual = math.divide(10, 2);

        Assert.assertEquals(expected, actual);
    }

    /**
     * Executes after every test method
     */
    @AfterMethod
    public void tearDown() {
        math = null;
    }

}
