package com.company;

public class Second {
    public static void main(String[] args) {
        int arr1[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr1[i] = (int) Math.round(Math.random() * 9);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < 20; j++) {
            if(j%2==1){
                arr1[j]=0;
            }
            System.out.print(arr1[j] + " ");
        }
    }
}