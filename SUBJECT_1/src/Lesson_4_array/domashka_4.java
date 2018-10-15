package Lesson_4_array;

import java.util.Random;
import java.util.Scanner;

public class domashka_4 {
    public static void main(String[] args) {
//Создайте массив, содержащий 20 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой
/*
        int ar[] = new int[20];
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 != 0) {
                ar[i] = i;
                System.out.print(ar[i] + ",");
            }
        }
*/

//найдите среднее арифматическое всех элементов массива
/*
        double ar[] = {1,5,8,7,4,8,9,5,7,4,5};
        double res = 0;
        for (int i = 0; i < ar.length; i++) {
            res = res + ar[i];
        }
        double b = res / ar.length;
        System.out.println(b);
*/


//каждый охотник желает знать где сидит фазан
//фазан сидит где знать желает охотник каждый
/*
        String ar[] = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        String temp1, temp2;
        int n = ar.length;
        for (int i = 0; i <n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < n/2 ; i++) {
           temp1 = ar[n-i-1];
           ar[n-i-1]=ar[i];
           ar[i] = temp1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
*/

//спросить про этот код
/*
        System.out.println(" ");
        for (int i = 0; i <n ; i++) {
            temp1 = ar[i];
            ar[i] =ar[n-i-1];
            ar[n-i-1] = temp1;
            System.out.print(ar[i] + " ");
        }
*/

//Нужно вывести на экран эти символы
//******
//*****
//****
//***
//**
//*
        for (int i = 6; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}




