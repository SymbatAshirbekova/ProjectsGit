package Lesson_9;

import java.util.Arrays;

public class Domashka_9_str2 {
    public static void main(String[] args) {
//Return true if the string "cat" and "dog" appear the same number of times in the given string
/*
 String str1 = "catsymbatdog";
System.out.println(str1.matches("(.*)cat(.*)")&&str1.matches("(.*)dog(.*)"));
*/
/*
        String a = "Z";
        String b = "12xz";
        int lena = a.length();
        int lenb = b.length();
        boolean res = false;hhhhhhhvyftyn
                System.out.println(true);
            }
          }
        }
}
xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/

/*
        String str = "abc.xyz";
        int a = str.length();
        int b = str.indexOf(".");
        for (int i = 0; i <= a - 3; i++) {
            if(str.contentEquals("(.*)xyz(.*)"))
            if (str.charAt(b-1)!='.'&&str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }

        String str2="abcbob";
            int c = str2.length();
            boolean res=false;
            for(int i=0;i<=c-3;i++){
                if(str2.charAt(i)=='b'&&(str2.charAt(i+2)=='b')){
                    System.out.println(str2.charAt(i)=='b'&&(str2.charAt(i+2)=='b'));
                }
                else System.out.println(str2.charAt(i)=='b'&&(str2.charAt(i+2)=='b'));
            }
 */

        String a = "xyz";
        String b = "abc";
        int lena = a.length();
        int lenb = b.length();
        int c = lena+lenb;
        char arA[] = new char[c];

                for (int i=0,j=0;i<3; i++, j=j+2){
                    arA[j]= a.charAt(i);
                    arA[j+1] = b.charAt(i);
                }
                System.out.println(Arrays.toString(arA));




    }
}
