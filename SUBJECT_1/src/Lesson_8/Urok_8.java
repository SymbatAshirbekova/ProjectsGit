package Lesson_8;

import java.sql.SQLOutput;
import java.util.*;

public class Urok_8 {
    public static void main(String[] args) {
/*
        Random rn = new Random();
        int a = rn.nextInt(10);
        System.out.println(a);

        double [] ar1 = new double [10];
        for (int i = 0; i < 10; i++) {
          //  ar1[i] = a;
           // ar1[i]=rn.nextInt(10);
            double mathrn = Math.random();
            ar1[i]=mathrn;
            System.out.println(ar1[i]);
        }
*/

/*
        int [][] ar2 = new int [2][2];
        ar2 [0][0]=1;
        ar2 [0][1]=2;
        ar2 [1][0]=3;
        ar2 [1][1]=4;
        System.out.println(Arrays.toString(ar2));
        for (int i = 0; i < ar2.length; i++) {
            for (int k = 0; k <ar2[i].length; k++) {
               // ar2[i][k] = i;
                System.out.print(ar2[i][k] + "\t");
            }
            System.out.println();
        }
*/



/*
        int [][] ar3 = new int [2][3];
        int [][] ar4 = new int [3][4];
        String [][] ar5 = new String[2][3];
        ar5 [0][0]="1";
        ar5 [0][1]="2";
        ar5 [1][0]="3";
        ar5 [1][1]="4";
        ar5 [1][2]="5";
        ar5 [0][2]=" ";
        for (int i = 0; i <ar3.length ; i++) {
            for (int j = 0; j < ar3[i].length; j++) {
                ar3[i][j] = j;
                System.out.print(ar3[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i <ar4.length ; i++) {
            for (int j = 0; j <ar4[i].length ; j++) {
                ar4[i][j]=j;
                System.out.print("str" + ar4[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i <ar5.length ; i++) {
            for (int j = 0; j <ar5[i].length ; j++) {
                System.out.print(ar5[i][j] + "\t");
            }
            System.out.println();
        }
*/
/*
        System.out.println("Программа позволяет узнать свой вес на Луне!");
        System.out.println("Напишите свой вес на земле ");
        Scanner sn = new Scanner(System.in);
        double a = sn.nextDouble();
        System.out.println("Ваш вес на Земле: " + a);
        double b = a*17.0/100.0;
        System.out.println("Ваш вес на Луне: " + b);
        System.out.println("Классно быть такой худой:)");
*/
/*
Scanner sn = new Scanner(System.in);
String a = sn.nextLine();
if (a.equals("бяка"))
{
    System.out.println("Не пишите бяка");
    String c =
}
else {
    System.out.println("Все нормально.");}
*/

/*
Random rn = new Random();
        int a = rn.nextInt(10) + 1;
        int[] ar1 = new int[10];
        for (int i = 0; i < 10; i++) {
            ar1[i] = rn.nextInt(10);

            if (i % 2 == 1)
            {
                ar1[i] = 0;
            }
                System.out.print(ar1[i]);
            }
            */

        String[] ludi = new String[5];
        int[] time = new int[5];
        ludi[0] = "Fara";
        ludi[1] = "Sara";
        ludi[2] = "Lara";
        ludi[3] = "Mara";
        int min = 0;
        time[0] = 35;
        time[1] = 20;
        time[2] = 40;
        time[3] = 15;

        for (int i = 0; i < time.length-1; i++) {
            if (time[i] < time[i + 1]) {
                min = time[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i < time.length; i++) {
            if(time[i] ==20){
                System.out.println(i);
                System.out.println(ludi[i]);
            }
        }
    }
}




