package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntsCalculatorTest {
    Ints calc1 = new IntsCalculator(new Calculator());

    @Test
    void sum() {
        int a = 5;
        int b = 15;
        int expect = a + b;
        int result = calc1.sum(5, 15);
        Assertions.assertEquals(expect, result);
    }

    @Test
    void mult() {
        int a = 5;
        int b = 15;
        int expect = a * b;
        int result = calc1.mult(5, 15);
        Assertions.assertEquals(expect, result);
    }

    @Test
    void pow() {
        int a = 3;
        int b = 4;
        double expect = Math.pow(a, b);
        int result = calc1.pow(3, 4);
        Assertions.assertEquals(expect, result);
    }
}