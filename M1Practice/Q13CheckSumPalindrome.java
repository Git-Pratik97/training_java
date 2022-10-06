package com.M1Practice;

import java.util.Scanner;

public class Q13CheckSumPalindrome {
    public static boolean checkPalindrome(int num) {
        int reversenum = 0;
        int original = num;
        boolean ispal = false;
        while(num > 0) {
            int digit = num % 10;
            reversenum = reversenum*10 + digit;
            num /= 10;
        }

        if(reversenum == original) {
            ispal = true;
        }
        return ispal;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the range:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum = 0;
        for(int i = n1; i <= n2; i++) {
            if(checkPalindrome(i)) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(" ");
        System.out.print("Sum = ");
        System.out.print(sum);
    }
}
