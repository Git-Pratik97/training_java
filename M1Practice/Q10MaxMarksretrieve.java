package com.M1Practice;

import java.util.*;

public class Q10MaxMarksretrieve {

    public static String maxMarks(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length; i++) {
            String s1 = str[i];
            StringTokenizer st = new StringTokenizer(s1, "#");
            String name = st.nextToken();
            int m1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int m3 = Integer.parseInt(st.nextToken());

            int total = m1 + m2 + m3;
            map.put(name, total);
        }

        String namemax = new String();
        int max = 0;
        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()) {
            String temp = itr.next();
            int j = map.get(temp);
            if (j > max){
                max = j;
                namemax = temp;
            }
        }
        return namemax + ": " + Integer.toString(max);

    }
    public static void main(String[] args) {
//        StringTokenizer st = new StringTokenizer("my,name,is,khan");
//
//        // printing next token
//        System.out.println("Next token is : " + st.nextToken(","));
//        System.out.println("Next token is: " + st.nextToken());
        String[] s1={"arun#12#12#12","deepak#13#12#12","puppy#12#11#12"};
        System.out.println(maxMarks(s1));


    }
}
