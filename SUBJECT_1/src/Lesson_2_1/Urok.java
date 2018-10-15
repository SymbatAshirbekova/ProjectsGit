package Lesson_2_1;

public class Urok {
    int age;
    String name;

    public static void main(String[] args) {
       Urok f = new Urok();//f Это экземпляр класса
        f.age = 24;//иницаиализация по ссылочной дать значение
        f.name = "Symbat";
        System.out.println(f.age);
        System.out.println(f.name);

        Urok f2 = new Urok();
        f2.age = 35;

        //иницаиализация через метод







    }
}
