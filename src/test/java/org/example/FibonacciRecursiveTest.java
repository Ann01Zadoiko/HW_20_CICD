package org.example;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursiveTest {

    FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();

    @org.junit.jupiter.api.Test
    void getFibonacci() {
        int n = 6;
        long actualResult = fibonacciRecursive.getFibonacci(n);
        long expectResult = 8;

        assertEquals(expectResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void getFibonacciIfNumberEqualsZero() {
        int n = 0;
        long actualResult = fibonacciRecursive.getFibonacci(n);
        long expectResult = 0;

        assertEquals(expectResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void getFibonacciIfNumberEqualsOne() {
        int n = 1;
        long actualResult = fibonacciRecursive.getFibonacci(n);
        long expectResult = 1;

        assertEquals(expectResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void getFibonacciIfNumberEqualsTen() {
        int n = 10;
        long actualResult = fibonacciRecursive.getFibonacci(n);
        long expectResult = 55;

        assertEquals(expectResult,actualResult);
    }
}

