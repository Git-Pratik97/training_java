package com.M1Practice;

import com.Assignment_day5.Int;

import java.util.ArrayList;
import java.util.List;

public class Q5RearranegeArray {
    public static List<Integer> rearrange(int [] arr1, int[] arr2) {
        List<Integer> newArray = new ArrayList<>();
//        for(int i = 0; i < arr1.length; i++) {
//            if (i % 2 != 2) {
//                newArray.add(arr1[i]);
//            } else {
//                newArray.add(arr2[i]);
//            }
//        }
        int i = 0;
        while (i < arr1.length) {
            newArray.add(arr1[i]);
            newArray.add(arr2[++i]);
            i++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {12,1,32,3};
        int[] arr2 = {0,12,2,23};

        List<Integer> arr = rearrange(arr1, arr2);

        System.out.println(arr);
    }
}
