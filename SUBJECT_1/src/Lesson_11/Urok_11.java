package Lesson_11;

public class Urok_11 {
    public static void main(String[] args) {
        int [] [] ar1 = new int [3][3];
        ar1 [0][0]=9;
        ar1 [0][1]=7;
        ar1 [0][2]=9;
        ar1 [1][0]=9;
        ar1 [1][1]=7;
        ar1 [1][2]=2;
        ar1 [2][0]=9;
        ar1 [2][1]=5;
        ar1 [2][2]=3;

        for (int i = 0; i < ar1.length; i++) {
            for (int k = 0; k <ar1[i].length; k++) {
                // ar2[i][k] = i;
                System.out.print(ar1[i][k] + "\t");
                 }
            System.out.println();
        }
            int k=0;
            int temp;
            temp = ar1[0][0];
            int temp2;
            temp2 = ar1[0][1];
            int temp3;
            temp3 = ar1[0][2];

            for (int i = 0; i < ar1.length; i++) {
                for (int j = 0; j < ar1[i].length; j++) {
                    if (ar1[i][j] == temp) {
                        ar1[i][0] = 0;

                    }
                    else if (ar1[i][j] == temp2) {
                        ar1[i][1] = 0;
                    }
                    else if (ar1[i][j] == temp3) {
                        ar1[i][2] = 0;
                    }
                    System.out.print(ar1[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }




