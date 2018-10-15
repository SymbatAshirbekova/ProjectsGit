package Lesson_5_array2;
import java.util.Random;
import java.util.Scanner;
public class urok_5 {
    public static void main(String[] args) {

        /*
        int numberArray []= new int[10];
        for(int i = 0; i < 10; i++){
            numberArray[i] = i;
        }
        for(int i = 0; i < 10; i++){
            System.out.println((i+1) + "-й элемент массива = " +  numberArray[i]);
        }
        */
//код Танира - это покер

        int cardsPerPlayer = 5;
        int players =0 ;
        String[] mast = {"Пик", "Бубен", "Черв", "Треф"};
        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
        int n = mast.length * num.length; // количество карт

        // часть 2 - ввод с консоли
        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");
            if(sc.hasNextInt()){
                players = sc.nextInt();
                if (players ==0){
                    System.out.println("Game Stop");
                    break;
                } else if (players<0){
                    System.out.println("Please, do not write num<0");
                }
                if(cardsPerPlayer * players <= n){//5*6=30 30<52
                    break;
                } else {
                    System.out.println("Sorry, Too many players");
                }
            } else{
                System.out.println("Do not write words");
            }
        }
        // часть 3 - инициализация колоды
        String[] deck = new String[n];//[30]
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < mast.length; j++) {
                deck[mast.length*i + j] = num[i] + " " + mast[j];
                //deck[4*0+0]
            }
        }
        Random random  =new Random();
        // часть 4 - перетасовка колоды
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(n-i);
            //  r=5;
            // случайная карта в колоде
            //
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // часть 5 - перетасованная колода выводится на экран
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            //i<30
            System.out.println(deck[i]);//deck[0]
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                //0%5 == 5-1
                // 0==4

                //1%5 == 4
                //2%5 == 4
                //3%5 == 4
                //4%5 == 4

                System.out.println();
        }

    }
}
