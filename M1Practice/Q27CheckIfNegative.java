package com.M1Practice;

import java.util.Scanner;

public class Q27CheckIfNegative {
    public static int negativeString(String s1) {
        int number = 0;
        if(s1.charAt(0) == '-') {
            int num = Integer.parseInt(s1);
            if(num < 0) {
                number = Math.abs(num);
            }
        }
        else {
            number = -1;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        System.out.println(negativeString(s1));
    }
}
