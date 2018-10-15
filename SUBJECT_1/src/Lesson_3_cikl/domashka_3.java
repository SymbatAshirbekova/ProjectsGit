package Lesson_3_cikl;

import java.util.Random;
import java.util.Scanner;

public class domashka_3 {
    public static void main(String[] args) {
//при помощи цикла for вывести на экран нечетные числа от 1 до 99
/*
        for (int i = 1; i < 99; i++) {
            int result = i%2;
            if (result != 0) System.out.println(i);
}

//дано число n. Нужно посчитать факториал при помощи for
/*
        int n=5;
        int res=1;
        for (int i = n; i>0; i--) {
             res=res*i;
        }
        System.out.println(res);
*/

//даны переменные x и n вычислить x^n
/*
        Scanner sn = new Scanner(System.in);
        int x = sn.nextInt();
        int n =sn.nextInt();
        int res= 1;
        for (int i = 1; i <=n ; i++) {
             res = res*x; }
        System.out.println(res);
*/


//Создать игру. На консоле будут выводиться рандомные задачи "2+3=?" и нам нужно отгадать ответ.
// программа должна высчитывать сколько вы ответили правильно и сколько не правильно
        Random rn1 = new Random();
        Random rn2 = new Random();
        Random rn3 = new Random();
        int operacia = rn3.nextInt(3) + 1;
        int win = 0;
        int lose = 0;
        if(operacia==1) {
            for (int i = 0; i < 5; i++) {
                int chislo1 = rn1.nextInt(20);
                int chislo2 = rn2.nextInt(20);
                int result1 = chislo1 + chislo2;
                System.out.println(chislo1 + "+" + chislo2 + "=?");
                Scanner sn = new Scanner(System.in);
                int otvet1 = sn.nextInt();
                if (otvet1 == result1) {
                    System.out.println("Верно!");
                    win++;
                } else {
                    System.out.println("Не верно!");
                    lose++;
                }
            }
            System.out.println("Количество верных ответов: " + win);
            System.out.println("Количество неверных ответов: " + lose);
        }
     if(operacia==2){
         for (int i = 0; i < 5; i++) {
             int chislo1 = rn1.nextInt(20);
             int chislo2 = rn2.nextInt(20);
             int result1 = chislo1 - chislo2;
             System.out.println(chislo1 + "-" + chislo2 + "=?");
             Scanner sn = new Scanner(System.in);
             int otvet1 = sn.nextInt();
             if (otvet1 == result1) {
                 System.out.println("Верно!");
                 win++;
             } else {
                 System.out.println("Не верно!");
                 lose++;
             }
         }
         System.out.println("Количество верных ответов: " + win);
         System.out.println("Количество неверных ответов: " + lose);
     }
        if(operacia==3){
            for (int i = 0; i < 5; i++) {
                int chislo1 = rn1.nextInt(20);
                int chislo2 = rn2.nextInt(20);
                int result1 = chislo1 * chislo2;
                System.out.println(chislo1 + "*" + chislo2 + "=?");
                Scanner sn = new Scanner(System.in);
                int otvet1 = sn.nextInt();
                if (otvet1 == result1) {
                    System.out.println("Верно!");
                    win++;
                } else {
                    System.out.println("Не верно!");
                    lose++;
                }
            }
            System.out.println("Количество верных ответов: " + win);
            System.out.println("Количество неверных ответов: " + lose);
        }
        if(operacia==4) {
            for (int i = 0; i < 5; i++) {
                int chislo1 = rn1.nextInt(20);
                int chislo2 = rn2.nextInt(20);
                int result1 = chislo1 / chislo2;
                System.out.println(chislo1 + "/" + chislo2 + "=?");
                Scanner sn = new Scanner(System.in);
                int otvet1 = sn.nextInt();
                if (otvet1 == result1) {
                    System.out.println("Верно!");
                    win++;
                } else {
                    System.out.println("Не верно!");
                    lose++;
                }
            }
            System.out.println("Количество верных ответов: " + win);
            System.out.println("Количество неверных ответов: " + lose);

//Правильный код
        /*
        Scanner sc =  new Scanner (System.in);
        System.out.println("Welcome to our game!!!");
        Random r1 = new Random();
        Random r2 = new Random();
        int win=0;
        int lose=0;

        for (int i=0; i<5; i++){
            int a = r1.nextInt(20);
            int b = r2.nextInt(20);
            System.out.print(a+"+"+b+"=");
            int res = sc.nextInt();
            if ((a+b)== res){
                System.out.println("Great!!!");
                win++;
            } else {
                System.out.println("Not right");
                lose++;
            }
        }
        System.out.println("Result: "+"Win: "+win+"Lose: "+lose);}}
        */

        }}}
























