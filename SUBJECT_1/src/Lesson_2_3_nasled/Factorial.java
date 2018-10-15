package Lesson_2_3_nasled;

public class Factorial {
    int a = 5;
    int res = 1;

    Factorial(int a){
        this.a = a;
    }

    int fact(){
        for (int i = 1; i <=a ; i++) {
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        Factorial fn = new Factorial(5);
        System.out.println(fn.fact());




    }
}
