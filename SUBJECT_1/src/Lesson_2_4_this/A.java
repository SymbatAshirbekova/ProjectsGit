package Lesson_2_4_this;

//public class Thisis {
//    static int sum(){
//        int a = 7;
//        int b = 8;
//        return a+b;
//
//    }
//    static int multSum(){
//        int multNum  = 3;
//        return multNum * sum();
//    }
//    public static void main(String[] args) {
//        System.out.println(multSum());
//
//    }
//}

//если нужно вызвать метод из другого класса то нужно вызвать this
public class A{
    void m(){
        System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
    }
}
class TestThis4{
    public static void main(String[] args) {
        A a=new A();
        a.n();
    }
}