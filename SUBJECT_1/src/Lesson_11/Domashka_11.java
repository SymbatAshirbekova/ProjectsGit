package Lesson_11;

public class Domashka_11 {
    public static void main(String[] args) {
        /*
        public class Tru {
            // объявление массива
            static int n = 6;
            static int[][] masA = new int[8][8];

            // метод заполнения массива
            public static void randMas() {
                for (int i = 0; i < masA.length; i++) {
                    for (int j = 0; j < masA[i].length; j++) {
                        masA[i][j] = (int) (Math.random() * 9);
                    }
                }
            }

            // метод поиска одинаковых элементов
            public static void Search() {
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j < n; j++) {
                        int g = j + 1;
                        while (masA[j][i] != masA[g][i] & g <= n) {
                            g++;
                        }
                        if (g <= n) {
                            masA[g][i] = 0;
                            masA[j][i] = 0;
                        }
                    }
                }
            }

            // метод вывода массива
            public static void Vivod() {
                for (int i = 0; i < masA.length; i++) {
                    System.out.println();
                    for (int j = 0; j < masA[i].length; j++) {
                        System.out.print(masA[i][j] + " ");
                    }
                }
            }

            // вызов методов в main
            public static void main(String[] args) {
                System.out.print("Изначальный массив:");
                // вызов описанного выше метода randMas
                randMas();
                // вывод заполненного массива
                Vivod();

                System.out.println();
                System.out.print("Преобразованный массив:");
                // применение к массиву операций обработки
                Search();
                // вывод измененного массива
                Vivod();
            }
        }
    }
    */
int n = 3;
String str = "Symbat";
        System.out.println(str.substring(0,n));
}}
