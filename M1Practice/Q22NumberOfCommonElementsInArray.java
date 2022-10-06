package com.M1Practice;

import java.util.HashSet;
import java.util.Set;

public class Q22NumberOfCommonElementsInArray {
    public static int commonElements(int[] a, int[] b) {
        int common = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    common++;
                    set.add(a[i]);
                }
            }
        }
        System.out.println(set);
        return common;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={3,4,5,6,7};
        System.out.println("Common Elements are - " + commonElements(a,b));
    }
}
