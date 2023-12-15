package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciIteratorTest {

    FibonacciIterator fibonacciIterator = new FibonacciIterator();

    @Test
    void getFibonacci() {
        int n = 6;
        long actualResult = fibonacciIterator.getFibonacci(n);
        long expectResult = 8;

        assertEquals(expectResult, actualResult);
    }
}
