package com.M1Practice;

public class Q20PrimeIndexesSum {
    public static boolean isPrime(int num) {
        boolean prime = true;
        for(int i = 2; i < num; i++) {
            if(num%i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static int sumOfPrimeIndices(int[] a, int n) {
        int sum = 0;
//        sum += a[2];
        for(int i = 2; i < n; i++) {
            if(isPrime(i)) {
                sum += a[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        int n = 12;

        System.out.println(sumOfPrimeIndices(a, n));
    }
}
