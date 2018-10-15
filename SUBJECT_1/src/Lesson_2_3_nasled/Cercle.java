package Lesson_2_3_nasled;
public class Cercle {
    float pi = 3.14f;
    static int radius; //попробуй без статик.
    // Статик нужно писать когда хочешь чтоб значение переменной поменялось.
    // Без статика переменная не будет меняться.

    Cercle(int radius){
        this.radius = radius*radius;
    }
    void display(){
        System.out.println(pi*radius);
    }

    public static void main(String[] args) {
        Cercle cn = new Cercle(5);
        Cercle cn2 = new Cercle(4);
        Cercle cn3 = new Cercle(3);
        cn.display();
        cn2.display();
        cn3.display();

    }
}
