package com.M1Practice;

import java.util.*;

class classSet11 {
    public static int stringRetrieval(String[] s1, String s2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            list.add(s1[i]);
        }

        int index = list.indexOf(s2);
        return index;

    }

    public static void main(String[] args) {
        String[] s1 = { "good", "yMe", "awe" };
        String s2 = "awe";
        System.out.println(stringRetrieval(s1, s2));
    }
}