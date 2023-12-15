package org.example;


public class FibonacciIterator {

    public long getFibonacci(int n){
        long fib = 1;
        long prevFib = 1;

        if (n < 2){
            return n;
        }

        for (long i = 2; i < n; i++) {

            long temp = fib;
            fib += prevFib;
            prevFib = temp;

        }

        return fib;
    }

}
