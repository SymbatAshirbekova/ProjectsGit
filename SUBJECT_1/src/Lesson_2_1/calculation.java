package Lesson_2_1;

public class calculation {
 void fact(int n){
     int res = 1;
     for(int i = 1; i<=n; i++){
         res = res*i;
     }
     System.out.println(res);
 }
    public static void main(String[] args) {
       new calculation().fact(5);   //анонимный объект класса

    }


}
