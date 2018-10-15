package Lesson_2_2konstruk;

public class Student {
    int id;
    String name;
    int kourse;

    Student (int i, String n, int k){
        id = i;
        name = n;
        kourse = k;
    }
    public static void main(String[] args) {
        Student student = new Student(100,"Marat", 2);
        Student student2 = new Student(200,"Alan", 3);
        Student student3 = new Student(300,"Maks", 1);

        System.out.println(student.id + " " + student.name +" курс: " + student.kourse);
        System.out.println(student2.id + " " + student2.name +" курс: " + student2.kourse);
        System.out.println(student3.id + " " + student3.name +" курс: " + student3.kourse);

    }
}
