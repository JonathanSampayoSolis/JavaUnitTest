package com.sampa.unit;

public final class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Can't divide by zero.");

        return dividend / divisor;
    }

    public int addHeavyTask(int a, int b) throws InterruptedException {
        Thread.sleep(1000);

        return add(a, b);
    }

}
