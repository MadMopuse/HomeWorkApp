/**
 * Java 1. Lesson 4
 *
 * @author MadMopuse
 * @version 15.04.2022 (Lesson 4)
 *
 */

import java.util.Random;
import java.util.Scanner;


class TicTacToe {

    //public static final char DOT_EMPTY = '•';
    Random random; //рандомиатор
    Scanner scanner; //сканер для чтения
    char[] [] table; //двумерная таблица для записи крестиков.ноликов

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe() ;
        ttt.game();
        //new TicTacToe().game(); //вызов конструктора
    }

    TicTacToe() {
        System.out.println("Constructor"); // если имя метода совпадает с названием класса
        // - это метод стратует автоматически сразу после создания объекта
        random = new Random();
        scanner = new Scanner(System.in); // чтение из консоли
        table = new char[3][3]; // создание таблицы
    }


    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin('x')) {
                System.out.println("You WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI ();
            if (checkWin('o')) {
                System.out.println("You WON1!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("Game over.");
        printTable();
    }

    void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x y [1..3]; ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            //System.out.println(x + " " + y);
        } while(!isCellValid(x, y));
        table[x][y] = 'x';
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while(!isCellValid(x, y));
        table[x][y] = 'o';
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }

    //Переделать проверку победы, чтобы она не была реализована просто набором условий,
    //например, с использованием циклов
    boolean checkWin(char ch) {
        for (int y = 0; y < 3; y++) {
            boolean check1 = true;
            for (int x = 0; x < 3; x++) {
                check1 = table[x][y] == ch && check1;
            }
            if (check1)
                return true;
        }

        for (int x = 0; x < 3; x++) {
            boolean check2 = true;
            for (int y = 0; y < 3; y++) {
                check2 = table[x][y] == ch && check2;
            }
            if (check2)
                return true;
        }

        boolean check3 = true;
        for (int x = 0; x < 3; x++) {
            check3 = table[x][x] == ch && check3;
        }
        if (check3)
            return true;
        if (table[0][2] == ch && table[1][1] == ch && table[2][0] == ch) return true;
        return false;
    }


        /*if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;

        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;


        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[0][2] == ch && table[1][1] == ch && table[2][0] == ch) return true;
        return false;*/
    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
