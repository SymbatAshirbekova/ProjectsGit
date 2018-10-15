package Lesson_2_4_this;

import java.util.Arrays;

public class Student implements Comparable {
    int studentid;
    String lastName;
    String firstName;

    public Student(int studentid, String lastName, String firstName) { //сначала в конструктор
        this.studentid = studentid;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Object obj) { //12
        Student tmp = (Student) obj;
        if (this.studentid < tmp.studentid)
            return -1;
        return studentid;
    }
    public static void main(String[] args) {
        Student[] students = new Student[3]; //это объектный массив
        students[0] = new Student(12, "Ashirbekova", "Symbat");
        students[1] = new Student(15, "Alayev", "Manas");
        students[2] = new Student(13, "Amfn", "Anar");

        Arrays.sort(students);

        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].studentid + " " + students[i].lastName + " " + students[i].firstName);
        }

        //Student st = new Student();
        //st.compareTo(studentid)

    }
}
