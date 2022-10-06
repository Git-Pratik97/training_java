package com.M1Practice;

public class Q24SquareEvenCubeOdd {
    public static int squaringAndCubingOfElements(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            if(i%2 == 0) {
                sum += Math.pow(a[i], 3);
            }
            else{
                sum += Math.pow(a[i], 2);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println(squaringAndCubingOfElements(a));
    }
}
