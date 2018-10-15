package Lesson_2_ifelse;

import java.util.Scanner;

public class urok_2 {
    public static void main(String[] args) {

        //Это логические операторы
        /*
        int a = 10;
        int b = 25;
        boolean c;
        System.out.println(c = a == b);
        System.out.println(c = a != b);
        System.out.println(c = a <= 50 || b <= 30);
        System.out.println(c = a <= 50 && b >= 30);
        */

        //Оператор == и .equals
        /*
        String a = new String("Symbat");
        String b = new String("Symbat");
        String f = a;
        boolean c, d, j;
        System.out.println(c = a == b); //это значит a!=b
        System.out.println(d = a.equals(b)); //это значит symbat==symbat
        System.out.println(j = f == a);//это значит f==a
        */

        /*
        boolean b = true;
        if(b){
            System.out.println("Symbat");
        }
        */


        // Синтаксис if else
        /*
        int a = 5;
        int b = 5;
        if (a == b) {
            System.out.println("a и b равны!");
        } else {
            System.out.println("a и b не равны!");
        }
        */
        //Cокращенный вид if else
        /* System.out.println(a==b ? "a и b равны!" : "a и b не равны!"); */


        //синтаксис case
        /*
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Выходные дни");
                break;
            default:
                System.out.println("Ничего нет");
        }
         */


//Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
        /*
        Scanner sn1 = new Scanner(System.in);
        int a, b, c, d;
        a = sn1.nextInt();
        b = sn1.nextInt();
        c = sn1.nextInt();
        d = sn1.nextInt();
        if (a < b && a < c && a < d) {
            System.out.println("Наименьшее число а: " + a);
        }
        if (b < a && b < c && b < d) {
            System.out.println("Наименьшее число b: " + b);
        }
        if (c < a && c < b && c < d) {
            System.out.println("Наименьшее число c: " + c);
        }
        if (d < a && d < b && d < c) {
            System.out.println("Наименьшее число c: " + d);
        }
        */

// Дискриминант задача
        /*
        double d, x1, x2;
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        double d1;
        System.out.println(a + "x^2" + "+" + b + "x" + "+" + c + "=0");
        d = b * b - 4 * a * c;
        d1 = Math.sqrt(d);
        System.out.println(d1);
        if (d1 > 0) {
            x1 = (-b - d1) / 2 * a;
            System.out.println(x1);
            x2 = (-b + d1) / 2 * a;
            System.out.println(x2);
        }
        if (d1 == 0) {
            x1 = -b / 2 * a;
            System.out.println(x1);
        }
        if (d1 < 0) {
            System.out.println("ошибка");
        }
 */
    }
}
