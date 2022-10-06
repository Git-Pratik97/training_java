package com.M1Practice;

import java.util.Scanner;

public class Q18StringConcat {
    public static String concatString(String s1, String s2) {
        String res = null;
        if(s1.length() == s2.length()) {
            res = s1.concat(s2);
        }
        else if(s1.length() > s2.length()) {
            res = s1.substring(s1.length()- s2.length()).concat(s2);
        }
        else{
            res = s1.concat(s2.substring(s2.length()- s1.length() + 1));
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();

        System.out.println(concatString(s1, s2));
    }
}
