package Lesson_2_2konstruk;

public class Deposite {
    Amount amount = new Amount();
    int calcDeposite(){
        int d = 4000;
        TestMain testMain = new TestMain();
        testMain.deposite = d;
        int a = testMain.deposite;
        int b = testMain.balance;
        int res = a+b;
        return res;


    }
}
