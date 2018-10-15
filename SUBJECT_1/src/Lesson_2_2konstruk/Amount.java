package Lesson_2_2konstruk;
import java.util.Scanner;
public class Amount {
    TestMain testMain = new TestMain();
    int input(){

        Scanner sn = new Scanner(System.in);
       int id = sn.nextInt();
        testMain.id = id;

        Scanner sn1 = new Scanner(System.in);
       String name = sn1.nextLine();
        testMain.name = name;

        Scanner sn2 = new Scanner(System.in);
       int  balance = sn2.nextInt();
        testMain.balance = balance;
       return balance;

    }
}
