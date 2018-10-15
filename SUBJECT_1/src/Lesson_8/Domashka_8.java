package Lesson_8;
import java.util.Scanner;
public class Domashka_8 {
    public static void main(String[] args) {
        //нужно сделать сложение/вычитание двоичных чисел, например 1111+011101 = 1111101
        System.out.println("Введите первое число: ");
        Scanner sn1 = new Scanner(System.in);
        String pervoeChislo = sn1.nextLine();
        System.out.println("Введите второе число: ");
        Scanner sn2 = new Scanner(System.in);
        String vtoroeChislo = sn1.nextLine();
        char [] ar1 = pervoeChislo.toCharArray();
        char [] ar2 = vtoroeChislo.toCharArray();
        int [] ar3 = new int [5];
        int temp=0;
        for (int i = 0; i<ar3.length; i++) {
            int a = (int) ar1[i] - 48;
            int b = (int) ar2[i] - 48;
            int c = a + b;
            ar3[i]=c;
                if(ar3[i]>1)
                {
                 ar3[i]=0;
                 temp=1;
                    ar3[i]=ar3[i+1]+temp;

                }
            System.out.print(ar3[i]);
            }

        }}


