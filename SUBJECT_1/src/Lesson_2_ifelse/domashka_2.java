package Lesson_2_ifelse;

import java.util.Random;
import java.util.Scanner;

public class domashka_2 {
    public static void main(String[] args) {
/*
//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
        Random rn1 = new Random();
        int a = rn1.nextInt(999);
        int b,c,d;
        b=a/100;
        c=a/10%10;
        d= a%100%10;
        System.out.println("Сгенерированное число: " + a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        if(b>c&&b>d){
            System.out.println("самая большая цифра: " + b);
        }
        if(c>b&&c>d){
            System.out.println("Самая большая цифра: " + c);
        }
        if(d>b&d>c){
            System.out.println("Самая большая цифра: " + d);
        }
        */


// Задача про часы
        /*
        Random rnd = new Random();
        int a = rnd.nextInt(28800);
        int b = a / 3600;
        String okonchanie;
        switch (b) {
            case 1:
                System.out.println("осталось: " + b + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("осталось: " + b + " часа");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("осталось: " + b + " часов");
                break;
        }
        */



//найти наименьшую цифру из введенных 3 чисел
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<b&&a<c) {
            System.out.println("Наименьшее число: " + a);
        }
        if (b<a&&b<c) {
            System.out.println("Наименьшее число: " + b);
        }
        if (c<a&&c<b) {
            System.out.println("Наименьшее число: " + c);
        }
        */


//при вводе чисел нужно показать его как оценку в школе
/*
        Random rn = new Random();
        int a = rn.nextInt(6);
        System.out.println(a);
        switch(a){
            case 1:
            case 2:
            case 3:
                System.out.println("Неудовлетворительно");
                break;
            case 4:
                System.out.println("Удовлетворительно");
                break;
            case 5:
                System.out.println("Отлично!");
                break;
        }
        */


//камень ножница бумага
/*
        System.out.println("Ваш выбор: ");
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        switch (a) {
            case 1:
                System.out.println("Вы выбрали камень! ");
                break;
            case 2:
                System.out.println("Вы выбрали ножницу! ");
                break;
            case 3:
                System.out.println("Вы выбрали бумагу! ");
                break;
            default:
                System.out.println("Некорректный выбор!");
        }
        Random rn = new Random();
        int b = rn.nextInt(3)+1;
        switch (b) {
            case 1:
                System.out.println("Компьютер выбрал камень");
                break;
            case 2:
                System.out.println("Компьютер выбрал ножницу");
                break;
            case 3:
                System.out.println("Компьютер выбрал бумагу");
                break;
        }
        if (a == 1 && b == 2) {
            System.out.println("Выиграл человек!");
        }
        if (a == 3 && b == 2) {
            System.out.println("Выиграл компьютер!");
        }
        */



//нужно проверить это четное число или нечетное
/*
Random rn = new Random();
        int a = rn.nextInt(99);
        if (a % 2 == 0) {
            System.out.println(a + " Это четное число!");
        } else {
            System.out.println(a + " Это не четное число!");
        }
        */


//нужно найти ближайшее число к 10 и показать
/*
Random rn1 = new Random();
int a = rn1.nextInt(10);
int b = rn1.nextInt(10);
System.out.println(a);
System.out.println(b);
int c = 10-a;
int d = 10-b;
if(c>d){
    System.out.println("ближайшее число к 10 это: " + b);
}
else{
    System.out.println("ближайшее число к 10 это: " + a);
}
*/


//нужно проверить находится ли сгенерированное число в диапазоне 25:100

Random rn = new Random();
int a = rn.nextInt(150) + 5;
if (a>25&&a<100){
    System.out.println(a + " находится в диапазоне [25:100]");
}
else{
    System.out.println(a + " не находится в диапазоне [25:100]");
}





    }
}

