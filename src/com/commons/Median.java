package com.commons;

import java.util.Arrays;

public class Median {
	// Function for calculating median
    public static double findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
 
        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
 
    // Driver program
    public static void main(String args[])
    {
        int a[] = { 2,1,4,7,4,8,3,6,4,0 };
        int n = a.length;
        System.out.println("Median = " + findMedian(a, n));
    }
}