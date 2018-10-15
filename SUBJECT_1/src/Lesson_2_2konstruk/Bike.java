package Lesson_2_2konstruk;
public class Bike {
    String name;
    int age;

    Bike(String n, int a) //это конструктор
    {
        name = n; //this name = name
        age = a;
    }

    public static void main(String[] args) {
        Bike bike =new Bike("Symbat", 23);
        System.out.println(bike.name + " " + bike.age);



    }
}
