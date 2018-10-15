package Lesson_10;
import java.util.Scanner;
public class Domashka_10 {
    int getInt1() {
        Scanner sn1 = new Scanner(System.in);
        int num1 = sn1.nextInt();
        return num1;
    }
    int getInt2() {
        Scanner sn2 = new Scanner(System.in);
        int num2 = sn2.nextInt();
        return num2;
    }
    char getOperation() {
        Scanner sn3 = new Scanner(System.in);
        char operation = sn3.nextLine().charAt(0);
        return operation;
    }
    int calc(int num1, int num2, char operation) {
        int result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        }
        return result;
    }

    public static void main(String[] args) {
        Domashka_10 rnb = new Domashka_10();
        int num1 = rnb.getInt1();
        char operation = rnb.getOperation();
        int num2 = rnb.getInt2();
        int result = rnb.calc(num1, num2, operation);
        System.out.println( "=" + result);

    }
}
