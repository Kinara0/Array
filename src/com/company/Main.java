package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Check whether an array contains a given number or not
        int arr[] = {12, 4, 6, 3, 6, 5, 66};
        System.out.println(contains(arr, 4));
        //find the first index of a given element in an array, if not found return -1
        System.out.println(firstIndexOf(arr, 10));
        //find the maximum value in an array
        System.out.println(min(arr));


    }

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value) {
                return true;
            }

        }
        return false;
    }
    public static int firstIndexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value) {
                return i;
            }

        }
        return -1;
    }
    public static int min(int[] arr) {
// find max value from an array
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];

            }

        }
        return min;
    }
}