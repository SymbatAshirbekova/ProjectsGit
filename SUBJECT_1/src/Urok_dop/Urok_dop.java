package Urok_dop;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
    public class Urok_dop {
        int fact(int n) {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res = res * i;
            }
            return res;
        }

public static void main(String[] args) throws IOException{
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Symbat");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());


            Urok_dop ud = new Urok_dop();
            int a  = ud.fact(5);
            String str = String.valueOf(a);
            fw.write(str);


        }

        }
