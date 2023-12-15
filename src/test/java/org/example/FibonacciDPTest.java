package org.example;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciDPTest {

    FibonacciDP fibonacciDP = new FibonacciDP();

    @org.junit.jupiter.api.Test
    void getFibonacci() {
        int n = 6;
        long actualResult = fibonacciDP.getFibonacci(n);
        long expectResult = 8;

        assertEquals(expectResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void getFibonacciIfNumberEqualsZero() {
        int n = 0;
        long actualResult = fibonacciDP.getFibonacci(n);
        long expectResult = 0;

        assertEquals(expectResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void getFibonacciIfNumberEqualsOne() {
        int n = 1;
        long actualResult = fibonacciDP.getFibonacci(n);
        long expectResult = 1;

        assertEquals(expectResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void getFibonacciIfNumberEqualsTen() {
        int n = 10;
        long actualResult = fibonacciDP.getFibonacci(n);
        long expectResult = 55;

        assertEquals(expectResult,actualResult);
    }
}