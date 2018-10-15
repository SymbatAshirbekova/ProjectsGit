package Lesson_3_cikl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class urok_3 {
    public static void main(String[] args) {
//синтаксис for
/*
for (int i = 0; i <10 ; i++) {
     System.out.println("Symbat" + i + " раз");
     }
*/

//синтаксис while
/*
int i = 10;
while (i < 11)
{   i++;
    System.out.println("Hello world!" + i + " раз"); };
*/


//синтаксис while do
/*
int i =30;
do {
    System.out.println("Hello KZ!" + i + " раз");
    i++;
}
while(i<11);
*/




/*
for (int i = 1000; i < 9994; i=i+3) {System.out.println("i: " + i);}
*/

/*
for (int a = 1, b=1; a < 55; a++, b=b+2) {System.out.println(b);}
*/

/*
for (int i = 90; i > 0 ; i=i-5) {System.out.println(i);}
*/

/*
for (int a = 1, b=1; a < 20; a++, b = 2*b)
 { System.out.println(b); }
 */

/*
//Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.
for (int a=2; a < 10000; a = 2*a-1)
{ System.out.println(a);}
*/

//Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166
/*
        for (int a = -166; a < 99; a=2*a+200) {
if(a<99&&a>-99){
System.out.println(a);
}}
*/

//фактиориал
        /*
        Scanner sn = new Scanner(System.in);
        int b = 1;
        int a = sn.nextInt();
        for (int i = a; i > 0; i--) {
             b = b * i;
        }
        System.out.println(b);
        */

//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры
        /*
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        for (int i = a;0<i; i--) {
         int b =a%i;
            if(b==0){
                System.out.println(i);
            }
        }
        */

    }}



