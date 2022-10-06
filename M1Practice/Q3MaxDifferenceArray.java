package com.M1Practice;

public class Q3MaxDifferenceArray {
    public static int max_diff(int [] arr) {
        int diff = 0;
        int max_diff = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            diff = Math.abs(arr[i] - arr[i+1]);
            if(diff > max_diff) {
                max_diff = diff;
            }
        }

        return max_diff;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3};
        int diff_max = max_diff(arr);

        System.out.println("Max Difference: " + diff_max);
    }
}
