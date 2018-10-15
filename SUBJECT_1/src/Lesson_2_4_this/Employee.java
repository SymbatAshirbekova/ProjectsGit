package Lesson_2_4_this;

public class Employee {
    String name;
    int age;
    String dest;
    int salary;

    Employee(String name){
        this.name = name;
    }

   public int age(int age){
        this.age = age;
        return age;
    }
    public String dest(String dest){
        this.dest =dest;
        return dest;
    }

    public int salary(int salary){
    this.salary = salary;
    return salary;
    }

    public void display(){
        System.out.println("Name is: " + name+"\n" + "Age is: " + age + "\n" + "Destination is: "+ dest + "\n" + "Salary is: " + salary);
    }

}
