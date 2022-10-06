package com.M1Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q28NotSpecificLengthString {
    public static int StringNotOfGivenLength(List<String> list, String s1) {
        int count = 0;
        for(String ele : list) {
            if(ele.length() != s1.length()) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList("aaa","bb","cccc","d");

        System.out.println(StringNotOfGivenLength(list, "bb"));
    }
}
