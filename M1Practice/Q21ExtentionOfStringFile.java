package com.M1Practice;

import java.util.StringTokenizer;

public class Q21ExtentionOfStringFile {
    public static String extensionString(String s1) {
        StringTokenizer st = new StringTokenizer(s1, ".");
        String filename = st.nextToken();
        String extention = st.nextToken();

        return extention;
    }

    public static void main(String[] args) {
        String s1="hello.jpeg";
        System.out.println(extensionString(s1));
    }
}
