package com.M1Practice;

import java.util.StringTokenizer;

public class Q31FirstNameAndInitial {
    public static String retrieveName(String s1) {
        StringTokenizer st = new StringTokenizer(s1, " ");
        String name = st.nextToken() + ", " + st.nextToken().charAt(0);

        return name;
    }

    public static void main(String[] args) {
        String s1 = " Bhavane Raghupati";
        System.out.println(retrieveName(s1));
    }
}
