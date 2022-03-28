package com.company;

public class Fifth {
    public static void main(String[] args) {
        int arr[] = new int[15];
        int count = 0;
        for (int i = 0; i < 15; i++) {
            arr[i] = (int) Math.round(Math.random() * 10);
            System.out.print(arr[i] + " ");
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println();
        System.out.println("Парних елементів в масиві: " +count);
    }
}
