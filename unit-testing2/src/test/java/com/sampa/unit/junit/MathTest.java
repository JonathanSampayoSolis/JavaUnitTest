
package com.sampa.unit.junit;

import com.sampa.unit.Math;
import org.junit.*;

public class MathTest {

    private Math math;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Executes once before all test");
    }

    /**
     * Executes before every test method
     */
    @Before
    public void setUp() {
        math = new Math();
    }

    /**
     * Executes after every test method
     */
    @After
    public void tearDown() {
        math = null;
    }

    /**
     * Simple JUnit test
     */
    @Test
    public void givenFourAndSevenShouldPlusElven() {
        final int expected = 11;

        final int actual = math.add(4, 7);

        Assert.assertEquals(actual, expected);
    }

    /**
     * Unit test currently disabled
     */
    @Ignore
    @Test
    public void givenThreePlusTenShouldGetThirteen() {
        final int expected = 13;

        final int actual = math.add(3, 10);

        Assert.assertEquals(actual, expected);
    }

    /**
     * Unit test for check exceptions
     */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test(expected = IllegalArgumentException.class)
    public void givenZeroAsDividerShouldThrowIllegalArgumentException() {
        math.divide(10, 0);
    }

    /**
     * Unit for timeout in milliseconds
     */
    @Test(timeout = 1000)
    public void givenOnePlusTwo2ShouldWorkNoLongerOneSecond() throws InterruptedException {
        final int expected = 3;

        final int actual = math.addHeavyTask(1, 2);

        Assert.assertEquals(expected, actual);
    }

    /**
     * Unit for fail_ throw a forced fail
     */
    @Test
    @Ignore
    public void testFail() {
        final int expected = 3;

        final int actual = math.add(1, 2);

        Assert.fail("Some message");

        Assert.assertEquals(expected, actual);
    }

    /**
     * Assume true for some dummy method; this works only for disable instead just crash it out
     */
    @Test
    public void onePlusTwoShouldGetThree() {
        //noinspection ConstantConditions
        Assume.assumeTrue(1 + 2 == 4);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Executes once after all test");
    }

}
