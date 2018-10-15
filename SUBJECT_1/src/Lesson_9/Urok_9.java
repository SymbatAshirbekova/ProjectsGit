package Lesson_9;

import java.util.Scanner;

public class Urok_9 {
// void return static это методы есть3 типа метода таких
//метод void
 /*
    void factorial() {
        int res2 = 1;
        for (int i = 1; i <= 5; i++) {
            res2 = res2 * i;
        }
        System.out.println(res2);
    }
*/

//static метод может вызываться без объекта класса
    /*
    static void summa() {
        int res3 = 0;
        for (int i = 0; i <= 5; i++) {
            res3 = res3 + i;
        }
        System.out.println(res3);
}
*/


// return дает ответ. не показывает. и это всегда число. должен вызываться вместе объектом класса у меня rnb
    /*
     int fibonachi(int chislo) {
        int res1 = 1;
        for (int i = 1; i <= chislo; i++) {
            res1 = res1 + i;
        }
        return res1;
    }

     int factorial(int chislo) {
        int res2 = 1;
        for (int i = 1; i <chislo; i++) {
            res2 = res2 * i;
        }
        return res2;
    }
     int summa(int chislo) {
        int res3=0;
        for (int i = 0; i <chislo; i++) {
            res3 = res3 + i;
        }
        return res3;
    }
    */



//нужно написать тру или фалсе когда делишь на 2
/*
    boolean delit(int f) {
        boolean result;
        if(f%2==0) result = true;
        else result = false;
        return result;
    }
*/

////нужно показать куб введенного числа
    double stepen(double chislo){
        double res = 0;
        res = Math.pow(chislo,3);
        return res;
    }

    public static void main(String[] args) {

        //нужно создать объект класса
        Urok_9 rnb = new Urok_9(); //переменная экземпляра класса rnd

        //это все одна задача
       /*
        System.out.println("Hello, Bro!");
        System.out.println("I can find fibonachi,factorial,summa");
        System.out.println("Please,choose what you want: ");

        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();

        System.out.println("Please,write your number: ");
        int chislo = sn.nextInt();

        switch(a) {
            case 1: System.out.println(rnb.fibonachi(chislo));
            break;
            case 2: System.out.println(rnb.factorial(chislo));
            break;
            case 3: System.out.println(rnb.summa(chislo));
            break;

        }
        */



//нужно написать тру или фалсе когда делишь на 2
        /*
        Scanner sn2 = new Scanner(System.in);
        int f = sn2.nextInt();
        System.out.println(rnb.delit(f));
        */


//нужно показать куб введенного числа
        Scanner sn3 = new Scanner(System.in);
        double chislo = sn3.nextDouble();
        System.out.println(rnb.stepen(chislo));







    }
}