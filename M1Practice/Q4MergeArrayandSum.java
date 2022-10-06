package com.M1Practice;

import java.util.ArrayList;
import java.util.List;

public class Q4MergeArrayandSum {
    public static int mergeandsum(int[] arr1, int[] arr2) {
        List<Integer> common = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    common.add(arr1[i]);
                }
            }
        }

        System.out.println(common);
        int elesum = 0;
        for (int element: common) {
            elesum += element;
        }

        return elesum;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={3,4,5,6};
        System.out.println(mergeandsum(a, b));
    }
}
