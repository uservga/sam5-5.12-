package com.company;

public class Third {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        double suma1 = 0;
        int arr2[] = new int[5];
        double suma2 = 0;
        int arr3[] = new int[5];
        double suma3 = 0;
        for(int i = 0; i < 5; i++){
            arr1[i] = (int) Math.round(Math.random() * 5);
            suma1 += arr1[i];
            System.out.print(arr1[i] + " ");
        }
        double saref1 = suma1/arr1.length;
        System.out.println();
        for(int i = 0; i < 5; i++){
            arr2[i] = (int) Math.round(Math.random() * 5);
            suma2 += arr2[i];
            System.out.print(arr2[i] + " ");
        }
        double saref2 = suma2/arr2.length;
        System.out.println();
        for(int i = 0; i < 5; i++){
            arr3[i] = (int) Math.round(Math.random() * 5);
            suma3 += arr3[i];
            System.out.print(arr3[i] + " ");
        }
        double saref3 = suma3/arr3.length;
        System.out.println();
        if (saref1 >= saref2 && saref1 >= saref3)
            System.out.println("В масиві №1 - найбільше середнє арефметичне = "+saref1);
        else if (saref2 >= saref1 && saref2 >= saref3)
            System.out.println("В масиві №2 - найбільше середнє арефметичне = "+saref2);
        else if (saref3 >= saref1 && saref3 >= saref2)
            System.out.println("В масиві №3 - найбільше середнє арефметичне = "+saref3);
        else if(saref1 == saref2 && saref1 == saref3 && saref2==saref3)
            System.out.println("Всі значеня рівні!");
    }
}