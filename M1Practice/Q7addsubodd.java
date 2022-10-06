package com.M1Practice;

import java.util.ArrayList;
import java.util.List;

public class Q7addsubodd {
    public static int addsub(int n) {
//        int i = 1;
//        int sum = 0;
//        int pos = 0;
//        while(i <= n) {
//            if(i%2 != 0) {
//                if(pos % 2 == 0) {
//                    sum += i;
//                }
//                else{
//                    sum -= i;
//                }
//            }
//            i++;
//            pos++;
//        }
        int sum = 0;
        List<Integer> elements = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                elements.add(i);
            }
        }
        System.out.println(elements);
        sum = elements.get(0);
        for(int i = 1; i < elements.size(); i++) {
            if(i % 2 != 0) {
                sum += elements.get(i);
            }
            else{
                sum -= elements.get(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int sumend = addsub(11);
        System.out.println("Sum at the end - " + sumend);
    }
}
