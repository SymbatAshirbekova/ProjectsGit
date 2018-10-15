package Lesson_2_3_nasled;
public class Counter_1 {
  static int count = 0;
    Counter_1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter_1 cn = new Counter_1();
        Counter_1 cn2 = new Counter_1();
        Counter_1 cn3 = new Counter_1();
    }


}
