import java.util.Arrays;

/**
 * Java 1. Home Lesson Three
 *
 * @author MadMopuse
 * @version 15.04.2022 (Home Lesson Three)
 *
 */
public class HomeWork3 {
    public static void main(String[] args) {

        invertArray();
       // emptyTill100();
       // multiplyByTwo();
       // diagonals();
       // System.out.println( Arrays.toString(twoArguments(5 , 3)));
       // minMaxSearch();

    }

    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void invertArray() {
        int[] invertArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for ( int i = 0; i < invertArray.length; i++) {
            //System.out.println(i + " : " + invertArray[i]);
            //invertArray[i] = 1 - invertArray[i];
            invertArray[i] = invertArray[i] == 1? 0 : 1;
        }
        System.out.println(Arrays.toString(invertArray));
    }

    // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    static void emptyTill100() {
        int[] emptyTill100 = new int[100];
        for (int i = 0; i < emptyTill100.length; i++) {
            emptyTill100[i] = i + 1;
            System.out.println(i + " : " + emptyTill100[i]);
        }
    }

    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void multiplyByTwo() {
        int[] multiplyByTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiplyByTwo.length; i++) {
            if (multiplyByTwo[i] < 6) {
                multiplyByTwo[i] = multiplyByTwo[i] * 2;
            }
            System.out.println(i + " : " + multiplyByTwo[i]);
        }
    }

    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    static void diagonals() {
        int[][] diagonals = new int[3][3];
        for (int i = 0; i < diagonals.length; i++) {
            diagonals[i][i] = 1;
            System.out.println(i + " : " + Arrays.toString(diagonals[i]));
        }
    }

    // Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    static int[] twoArguments(int len, int initialValue) {
        int[] twoArguments = new int[len];
        for ( int i = 0; i < twoArguments.length; i++) {
            twoArguments[i] = initialValue;
        }
        return twoArguments;

    }

    // Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    static void  minMaxSearch() {
        int[]  minMaxSearch = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minSearch = minMaxSearch[0];
        int maxSearch = minMaxSearch[0];
        for (int i = 0; i < minMaxSearch.length; i++) {
            if (minMaxSearch[i] < minSearch) {
                minSearch = minMaxSearch[i];
            }
            if (minMaxSearch[i] > maxSearch) {
                maxSearch = minMaxSearch[i];
            }
        }
        System.out.println(minSearch + " " +  maxSearch);
    }
}
