package com.M1Practice;

import java.util.ArrayList;
import java.util.List;

public class Q29RemoveElementFromArray {
    public static int[] removalOfGivenElementFromArray(int[] a, int c) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            if(a[i] != c) {
                list.add(a[i]);
            }
        }

        int[] b = new int[list.size()];
        for(int i = 0; i < b.length; i++) {
            b[i] = list.get(i);
        }

        return b;
    }

    public static void main(String[] args) {
        int a[]= {10,10,20,30,40,50};
        int c=10;
        int[] b=removalOfGivenElementFromArray(a,c);
        for(int d:b)
            System.out.println(d);
    }
}

