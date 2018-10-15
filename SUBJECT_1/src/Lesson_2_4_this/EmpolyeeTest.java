package Lesson_2_4_this;

public class EmpolyeeTest {
    public static void main(String[] args) {
        Employee em = new Employee("Symbat");
        System.out.println(em.name);

       em.age(23);
       em.dest("IT PDM");
       em.salary(250000);
       em.display();

    }
}
