package Lesson_2_1;

public class Rectangle {
int a,b,c,v;

void insert (int a1, int b1, int c1){
    a = a1;
    b = b1;
    c = c1;
}

void calculate(){
    v = a*b*c;
}

void display(){
    System.out.println(v);
}
    public static void main(String[] args) {
        Rectangle rn = new Rectangle();
        rn.insert(5,8,7);
        rn.calculate();
        rn.display();
    }
}
