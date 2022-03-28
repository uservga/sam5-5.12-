package com.company;

public class Seventh {
    public static void main(String[] args) {
        int summ = 0;
        int summ_max = 0;
        int index = 0;
        int index_all = 0;
        int arr[][]= new int[7][7];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 6);
                summ += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("- Sum: " + summ + ", Index: "+ index);
            if(summ > summ_max){
                summ_max = summ;
                index_all = index;
            }
            summ = 0;
            index++;
        }
        System.out.println("Найбільше число: " + summ_max + " в стрічці з індексом(0-6): " + index_all);
    }
}
