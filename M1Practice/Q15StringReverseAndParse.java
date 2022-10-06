package com.M1Practice;

import java.util.Scanner;

public class Q15StringReverseAndParse {
//    public static String reversedAndParsedString(String s1) {
//        //Using StringBuffer Class for Mutability
//        StringBuffer str = new StringBuffer(s1);
//        str.reverse();
//        for (int i = 0; i < s1.length()*2 - 1; i++) {
//            if(i%2 != 0) {
//                str.insert(i, "-");
//            }
//        }
//        return str.toString();
//    }

    //Using normal String class
    public static String reversedAndParsedString(String s1) {
        String reversed = "";
        int len = s1.length();
        for(int i = 0; i < len; i++) {
            reversed += s1.charAt(len- i - 1);
        }
        String parsed = "";
        for(int i = 0; i < len - 1; i++) {
            parsed += reversed.charAt(i);
            parsed += "-";
        }
        parsed += reversed.charAt(len-1);

        return parsed;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String - ");
        String str = scan.next();
        System.out.println(reversedAndParsedString(str));
    }
}
