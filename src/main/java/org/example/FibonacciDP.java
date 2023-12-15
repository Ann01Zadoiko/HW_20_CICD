package org.example;

import java.util.ArrayList;

import java.util.List;


public class FibonacciDP {

    private List<Long> fibonacciList = new ArrayList<>();

    public long getFibonacci(int n) {

        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                fibonacciList.add((long) i);
            } else {
                fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
            }
        }

        return fibonacciList.get(n);
    }

}
