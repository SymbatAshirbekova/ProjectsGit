package Lesson_7;

public class Urok_7 {
//методы
    void sum(){
        int a = 7;
        int b = 4;
        System.out.println(a+b);
    }
    static void mult(){
        int a = 7;
        int b = 4;
        System.out.println(a*b);
    }
/*
    int delit(){
    int a = 7;
    int b = 4;
    return a/b;
    }
*/


    public static void main(String[] args) {
        // создаю объект класса
        //anagrama - переменная экземпляра
        Urok_7 anagrama = new Urok_7();
        anagrama.sum();

        mult();
       /* System.out.println(delit());*/


        /*
        System.out.println("Введите размер массива");
        Scanner sn = new Scanner(System.in);
        int b = sn.nextInt();
        int [] ar = new int [b];
        Random rn = new Random();
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rn.nextInt(1000);
        }
        System.out.print(Arrays.toString(ar));
        System.out.println(" ");
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if(ar[j]<ar[j+1]){
                    max = ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=max;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
        */


    }
}

