package Lesson_2_1;
import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Alisher {
    String slova;
    String ar[] = new String[3];
    void insert(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("Please, write word");
            Scanner sn = new Scanner(System.in);
           String n = sn.nextLine();
           ar[i] = n;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        Alisher al = new Alisher();
        al.insert();

    }



        }
