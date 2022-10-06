package com.M1Practice;

public class Q32DuplicateCharactersRemover {
    public static String removalOfDuplicateCharacters(String s1) {
        StringBuffer str = new StringBuffer(s1);
        for(int i = 0; i < s1.length(); i++) {
            for(int j = i+1; j < s1.length(); j++) {
                if(s1.charAt(i) == s1.charAt(j)) {
                    str.deleteCharAt(j);
                }
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s1="bhavane";
        System.out.println(removalOfDuplicateCharacters(s1));
    }
}
