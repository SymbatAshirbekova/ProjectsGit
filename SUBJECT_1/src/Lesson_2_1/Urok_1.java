package Lesson_2_1;
public class Urok_1 {
    String name;
    int age;

    void insert(String n, int a){ //
        name =n;
        age = a;
    }

    void display(){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        Urok_1 st = new Urok_1();
        st.insert("Symbat",24);
        st.display();
    }
}
