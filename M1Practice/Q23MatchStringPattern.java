package com.M1Practice;

public class Q23MatchStringPattern {
    public static boolean stringPattern(String s1, String s2) {
        String str1 = s1.length()<s2.length() ? s1 : s2;
        String str2 = s1.length()>s2.length() ? s1 : s2;

        System.out.println(str1 + " + " + str2);

        boolean bool = true;
        String pattern = str2.substring(str1.length());
        System.out.println(pattern);
        if(pattern.contains("-")) {
             bool = false;
        }
        else{
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) == '-' || str2.charAt(i) == '-') {
                    if(str1.charAt(i) != str2.charAt(i)) {
                        bool = false;
                        break;
                    }
                }
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        String s1="he--ll--";
        String s2="we--ll--";
        boolean b=stringPattern(s1,s2);
        if(b==true)
            System.out.println("same pattern");
        else
            System.out.println("different pattern");
    }
}
