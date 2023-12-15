package org.example;

public class FibonacciRecursive {

    public long getFibonacci(int n){
        return (n < 2) ? n : getFibonacci(n-1) + getFibonacci(n-2);
    }

}
