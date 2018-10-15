package Lesson_2_2konstruk;

public class TestMain {
    int id;
    String name;
    int balance;
    int withDraw;
    int deposite;

    public static void main(String[] args) {
        Deposite deposite = new Deposite();
        WithDraw withDraw = new WithDraw();
        System.out.println("Введите все");
        Amount amount = new Amount();
        amount.input();
        System.out.println(deposite.calcDeposite());
        System.out.println(withDraw.calcWithDraw());


    }

}
