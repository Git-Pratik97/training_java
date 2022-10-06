package com.M1Practice;

public class Q25StringPalindromeAndCheckVowels {
    public static boolean palindromeAndVowelCheck(String s) {
        boolean ispalindrome = true;
        int charcount = 0;
        StringBuffer str = new StringBuffer(s);
        String reverse = str.reverse().toString();
        String vowel = "aeiou";
        if(!reverse.equals(s)) {
            ispalindrome = false;
        }
        else {
            for(int i = 0; i < vowel.length(); i++) {
                for(int j = 0; j < s.length(); j++) {
                    if(vowel.charAt(i) == s.charAt(j)) {
                        charcount++;
                    }
                    continue;
                }
            }
            if(charcount < 2) {
                ispalindrome = false;
            }
        }


        return ispalindrome;
    }

//    public static boolean palindromeAndVowelCheck(String s){
//        boolean b=true;
//        int c=0;
//        String s1="aeiou";
//        StringBuffer sb=new StringBuffer(s);
//        String s2=sb.reverse().toString();
//        if(!s2.equals(s))
//            b=false;
//        else{
////            loop:
//            for(int i=0;i<s1.length();i++)
//                for(int j=0;j<s.length();j++)
//                    if(s1.charAt(i)==s.charAt(j)){
//                        c++;
////                        continue loop;
//                        }
//            if(c<2)
//                b=false;
//        }
//        return b;
//    }

    public static void main(String[] args) {
        String s="udeiedu";
        System.out.println(palindromeAndVowelCheck(s));
    }
}
