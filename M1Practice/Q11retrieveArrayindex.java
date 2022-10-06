package com.M1Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q11retrieveArrayindex {
    public static int retrieveindex(String[] str, String ele) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        int indexele = 0;
        if(list.contains(ele)) {
            indexele = list.indexOf(ele);
        }

        return indexele;
    }

    public static void main(String[] args) {
        String[] s1={"good","yMe","awe"};
        String s2="awe";
        System.out.println(retrieveindex(s1, s2));
    }
}
