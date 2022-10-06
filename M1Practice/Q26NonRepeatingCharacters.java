package com.M1Practice;

public class Q26NonRepeatingCharacters {
    public static int noOfnonRepeatedCharacters(String s1) {
        int[] alphas = new int[26];
        String s2 = s1.toLowerCase();

        for(int i = 0; i < s2.length(); i++) {
            alphas[s2.charAt(i) - 'a']++;
        }

        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(alphas[i] == 1) {
                count++;
                System.out.print((char)(i+97) + " ");
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1="preehit";
        System.out.println(noOfnonRepeatedCharacters(s1));
//        System.out.println('b' - 'a');
    }
}
