package Urok_dop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class ldvsf {
    public static void main(String[] args) throws IOException {

        Scanner sn = new Scanner(System.in);
        String a  = sn.nextLine();
        String [] s = a.split(" ");

        System.out.println(Arrays.toString(s) + "\n");

        FileWriter fw = new FileWriter("file.txt");
       // fw.write(Arrays.toString(s));

        for(String ar:s){
            System.out.println(ar);
            fw.write(ar + "\n");
        }

        fw.flush();
        fw.close();

        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());

//
//        for (int i = 0; i <6 ; i++) {
//            Scanner sn = new Scanner(System.in);
//            String[] arr = new String[6];
//            String a = sn.nextLine();
//            arr[i] = a;
//            System.out.println(arr[i]);
//        }





    }
}