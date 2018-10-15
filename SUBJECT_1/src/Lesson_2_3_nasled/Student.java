package Lesson_2_3_nasled;
public class Student {
    String name;
    int age;
    static String lastName = " Ashirbekova";


    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println(name + " " + age + lastName);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Symbat", 23);//здесь создается объект класса.
// Переменная которую мы придумываем называется переменная экземпляра. Здесь student1
        Student student2 = new Student(student1);
        student1.display();
        student2.display();
    }
}
