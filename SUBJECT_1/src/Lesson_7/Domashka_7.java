package Lesson_7;
import java.util.Arrays;
import java.util.Scanner;

public class Domashka_7 {
public static void main(String[] args) {
//Нужно двоичное число с остатком перевести в десятичное число с остатком
        System.out.println("Выберите операцию:" + "\n" + "1.Перевести число с остатком в десятичную систему счисления." + "\n" + "2.Перевести число с остатком в двоичную систему счисления.");
        Scanner menu = new Scanner(System.in);
        int vibor = menu.nextInt();
        if (vibor == 1) {
            System.out.println("Введите число в двоичном виде:");
            Scanner sn = new Scanner(System.in);
            String chislo = sn.nextLine();
            int indextochki = chislo.indexOf(".");
            char[] ar1 = chislo.toCharArray();
            int ascii = 0;
            double result1 = 0;
            double result2 = 0;
            for (int i = 0; i < ar1.length; i++) {
                if (i < indextochki) {
                    ascii = (int) ar1[i] - 48;
                    result1 = result1 + ascii * Math.pow(2, indextochki - 1 - i);
                } else if (i > indextochki) {
                    ascii = (int) ar1[i] - 48;
                    result2 = result2 + ascii * Math.pow(2, -(i - indextochki));
                }
            }
            double perevedchislo = result1 + result2;
            System.out.println("двоичное число " + chislo + " в десятичной системе счисления будет:" + perevedchislo);
        }
        if (vibor == 2) {
            System.out.println("Введите число в десятичном виде в формате ab.cd:");
            Scanner sn2 = new Scanner(System.in);
            double chislo2 = sn2.nextDouble();
            int drop = 0;
            int[] array1 = new int[8];
            int[] array2 = new int[10];
            int index = array1.length - 1;
            int ostatok;
            int ostat;
            int celoe = (int) chislo2;
            for (int i = celoe; i > 0; i = i / 2, index--) {
                ostatok = i % 2;
                array1[index] = ostatok;
            }
            drop = (int) Math.round((chislo2 - celoe) * 100);
            for (int i = drop, k = 0; k <=array2.length - 1; i = i * 2, k++) {
                ostat = i / 100;
                if (ostat % 2 == 0) {
                    array2[k] = 0;
                }
                 else if (ostat % 2 != 0) {
                    array2[k] = 1;
                }
            }
            System.out.println("целая часть "+ celoe + " в двоичной системе равна: ");
            for (int i = 0; i < 8; i++) {
                System.out.print(array1[i]);
            }
            System.out.println("\n");
            System.out.println("остаточная часть " + drop + " в двоичной системе равна: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(array2[i]);
            }

        }

    }
}
