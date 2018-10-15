package Lesson_6_array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class urok_6 {
    public static void main(String[] args) {
//метод сортировки массива - пузырька
/*
        Random rn  = new Random();
        int array [] = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int min=0;

        for (int i = array.length-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j]>array[j+1]){
                    min = array[j+1];
                    array[j+1]=array[j];
                    array[j]=min;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
*/


// нужно перевести число в двоичную систему
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int temp = 0;
        int ar1 [] = new int [8];
        int n = ar1.length;
        int k=7;

        for (int i = a; i>0; i=i/2, k--) {
           temp = i%2;
           ar1[k] = temp;
        }
        System.out.println("Введите число в десятичном виде");
        System.out.print("число " + a + " в двоичном виде будет " + Arrays.toString(ar1));










    }
    }
