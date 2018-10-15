package Lesson_2_1;
public class Emplyee {
    String name;
    int age;
    int salary;

    void insert(String n,int a,int s){
        name = n; //это и есть инициализация через метод
        age = a;
        salary = s;
    }
    void display(){
        System.out.println(name + " " + age + " " + salary + " ");
    }
}


    class Test {


    public static void main(String[] args) {
        Emplyee em = new Emplyee();
        em.insert("Symbat",23,10000000);
        em.display();

        Emplyee em2 = new Emplyee();
        em2.insert("Ayna",23,10000000);
        em2.display();

        Emplyee em3 = new Emplyee();
        em3.insert("Anar",23,10000000);
        em3.display();
    }
}

