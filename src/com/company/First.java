package com.company;

public class First {

    public static void main(String[] args) {
        int arr[] = new int[50];
        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
            System.out.println(arr[j] = i);
        }
    }
}
