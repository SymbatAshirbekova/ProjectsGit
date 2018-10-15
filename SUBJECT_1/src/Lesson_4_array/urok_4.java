package Lesson_4_array;

        import java.util.Random;
        import java.util.Scanner;

public class urok_4 {
    public static void main(String[] args) {
        /*
        int arrayA[] = new int[4];
        arrayA[0] = 12;
        arrayA[1] = 17;
        arrayA[2] = 14;
        arrayA[3] = 104;

        int arrayB[] = {1, 5, 3, 7, 8, 15};
        for (int i = 0; i < 6; i++) {
            System.out.print(arrayB[i] + " ");
        }

        for (int ar : arrayB) {
            System.out.println(ar + " ");
        }
        */


//нужно найти минимальное число в массиве
        int[] numbers = {-9, 6, 0, -59};
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(min>numbers[i])
                min = numbers[i];
        }
        System.out.println(min);


    }
}

