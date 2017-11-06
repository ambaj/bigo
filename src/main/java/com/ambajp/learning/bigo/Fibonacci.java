package com.ambajp.learning.bigo;


public class Fibonacci {

    public static void main(String args[]) {
        Fibonacci fb = new Fibonacci();
        System.out.println("Nth Fibonacci Number: " + fb.fib(5));
    }

    int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
