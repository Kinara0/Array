package com.company;

public class Main {

    public static void main(String[] args) {
        // Check whether an array contains a given number or not
        int arr[] = {2, 4, 6, 3, 6, 5, 66};
        System.out.println(contains(arr, 4));
    }

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value) {
                return true;
            }

        }
        return false;
    }
}