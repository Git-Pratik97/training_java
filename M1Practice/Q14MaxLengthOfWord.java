package com.M1Practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q14MaxLengthOfWord {
    public static String MaxlenWord(String s1) {
        int maxlen = 0;
        String finalstr = null;
        StringTokenizer st = new StringTokenizer(s1, " ");
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            int len = temp.length();
            if(len > maxlen) {
                maxlen = len;
                finalstr = temp;
            }
        }

        return finalstr + " (length - " + maxlen + ")";
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the String - ");
        String str = scan.nextLine();

        System.out.println(MaxlenWord(str));
    }
//public static String lengthiestString(String s1){
//    int max=0;
//    String s2=null;
//    StringTokenizer t=new StringTokenizer(s1," ");
//    while(t.hasMoreTokens()){
//        s1=t.nextToken();
//        int n=s1.length();
//        if(n>max){
//            max=n;
//            s2=s1; 	}
//    }
//    return s2;
//}
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter the String:");
//        String s1=s.nextLine();
//        System.out.println("the lengthiest string is:"+lengthiestString(s1));
//    }
}
