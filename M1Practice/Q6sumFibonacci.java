package com.M1Practice;

public class Q6sumFibonacci {
    public static int fibosum(int n) {
        int a = -1, b = 1;
        int c = 0;
        int sum = 0;

        for(int i = 0; i <= n; i++) {
            c = a+b;
            a = b;
            b = c;
            sum += c;
        }


        return sum;
    }

    public static void main(String[] args) {
        int sumfib = fibosum(5);
        System.out.println("Sum: " + sumfib);
    }
}
