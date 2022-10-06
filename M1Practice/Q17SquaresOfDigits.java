package com.M1Practice;

import java.util.Scanner;

public class Q17SquaresOfDigits {
    public static double squaresOfDigits(int num) {
        double sum = 0;
        while(num > 0) {
            int digit = num%10;
            sum += Math.pow(digit, 2);
            num /= 10;
        }

        return Math.round(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(squaresOfDigits(num));
    }
}
