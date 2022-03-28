package com.company;

public class Fourth {
    public static void main(String[] args) {
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int arr3[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            arr2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            arr3[i] = arr1[i] + arr2[i];
            System.out.print(arr3[i] + " ");
        }
    }
}
