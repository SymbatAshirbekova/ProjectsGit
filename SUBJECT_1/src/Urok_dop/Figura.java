package Urok_dop;
import Lesson_2_1.Rectangle;
import Lesson_2_1.Urok;

import java.io.*;
import java.util.Scanner;
public class Figura {
    float pi = 3.14f;
    int r, a, b, c;

    public static void main(String[] args) throws IOException {
//        int [] ar = new int [4];
//        FileWriter fw = new FileWriter("file.txt");
//        for (int i = 0; i < 4; i++) {
//            Scanner sn = new Scanner(System.in);
//            int z = sn.nextInt();
//            ar[i] = z;
//            fw.write(ar[i]+"\t");
//        }
//        fw.flush();
//        fw.close();

//        FileReader fr = new FileReader("file.txt");
//        BufferedReader br = new BufferedReader(fr);
//        System.out.println(br.readLine());

        Cube cube = new Cube();
        System.out.println(cube.calcCube(5,5,8));

        Circle circle = new Circle();
        System.out.println(circle.calc(3.14f,5));

        FileWriter fw1 = new FileWriter("input.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw1);
        String str = String.valueOf(cube.calcCube(5,5,8));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();

        FileReader fw5 = new FileReader("input.txt");
        BufferedReader bfw = new BufferedReader(fw5);
        System.out.println(bfw.readLine());


        FileWriter fw2 = new FileWriter("output.txt");
        BufferedWriter bufferedWrite22 = new BufferedWriter(fw1);


    }
}
