package Lesson_1_types;

public class domashka_1 {
    public static void main(String[] args) {
//в переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком
/*
int q = 22;
int w= 3;
System.out.println(q + " деленная на " + w + " будет равно " + q/w + " и в остатке будет " + q%w);
*/



//в переменной n хранится натуральное двухзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n
/*
int a = 58;
int celoe = a/10;
int ostatok = a%10;
System.out.println(celoe + ostatok);
*/



//в переменной n хранится натуральное трехзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n
/*
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = a/100;
        int c = a%100/10;
        int d = a%100%10;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b + c + d);
*/


// Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран
        double a = 4.6;
        int b = (int) Math.round(a);
        System.out.println(b);

    }
}