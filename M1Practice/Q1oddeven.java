package com.M1Practice;

import java.util.Scanner;


public class Q1oddeven {
    public static int sumoddeven(int n) {

        int sum = 0;

        while(n > 0) {
            int digit = n%10;
            if(digit%2 != 0) {
                sum += digit;
            }
            n /= 10;
        }

        System.out.println(sum);
        if(sum%2 == 0) {
            return -1;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int n1 = 52135;
        int n2 = 1112;
        int result = sumoddeven(n1);
        int result2 = sumoddeven(n2);
        System.out.println("for n1: " + result);
        System.out.println("For n2: " + result2);

    }
}
