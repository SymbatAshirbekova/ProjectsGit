package Lesson_6_array;
import java.util.Arrays;
import java.util.Scanner;
public class domashka_6 {
    public static void main(String[] args) {
        System.out.println("Выберите операцию:" + "\n" + "1.Перевести число в двоичную систему счисления." + "\n" + "2.Перевести число в десятичную систему счисления." + "\n" + "3.Перевести число в шестнадцатеричную систему счисления." + "\n");
        Scanner sn1 = new Scanner(System.in);
        int vibor = sn1.nextInt();

        if (vibor == 1) {
            System.out.println("Введите число: ");
            Scanner sn2 = new Scanner(System.in);
            int chislo = sn2.nextInt();
            int[] array1 = new int[100];
            int index = array1.length - 1;
            int ostatok;
            int schetchik = 0;
            for (int i = chislo; i > 0; i = i / 2, index--) {
                ostatok = i % 2;
                array1[index] = ostatok;
                schetchik++;
            }
            int index2 = array1.length - schetchik;
            int[] array2 = new int[schetchik];
            for (int i = 0; i < schetchik; i++) {
                array2[i] = array1[i + index2];
            }
            System.out.print("Число " + chislo + " в двоичной системе счисления будет равно " + Arrays.toString(array2));
        }

        if (vibor == 2) {
            System.out.println("Введите число в двоичном виде: ");
            Scanner sn3 = new Scanner(System.in);
            String dvoikachislo = sn3.nextLine();
            char[] chisla = dvoikachislo.toCharArray();
            double desyat = 0;
            for (int i = 0; i < chisla.length; i++) {
                double cifra = (int) chisla[i] - 48;
                desyat = desyat + cifra * (Math.pow(2, chisla.length - 1 - i));
            }
            System.out.println(dvoikachislo + " в десятичном виде будет равно " + desyat);
        }

        if (vibor == 3) {
            System.out.println("Введите число в десятичном виде: ");
            Scanner sn4 = new Scanner(System.in);
            int chis = sn4.nextInt();
            int[] array3 = new int[100];
            int index3 = array3.length - 1;
            int schet = 0;
            for (int i = chis; i > 0; i = i / 16, index3--) {
                int ostat = i % 16;
                array3[index3] = ostat;
                schet++;
            }
            int index4 = array3.length - schet;
            int[] array4 = new int[schet];
            for (int i = 0; i < schet; i++) {
                array4[i] = array3[index4 + i];
            }
            String[] array5 = new String[array4.length];
            for (int i = 0; i < array4.length; i++) {
                String cifry = String.valueOf(array4[i]);
                switch (array4[i]) {
                    case 10:
                        array5[i] = "A";
                        break;
                    case 11:
                        array5[i] = "B";
                        break;
                    case 12:
                        array5[i] = "C";
                        break;
                    case 13:
                        array5[i] = "D";
                        break;
                    case 14:
                        array5[i] = "E";
                        break;
                    case 15:
                        array5[i] = "F";
                        break;
                    default:
                        array5[i] = cifry;
                }
                System.out.print(array5[i]);
            }
        }


    }
}







