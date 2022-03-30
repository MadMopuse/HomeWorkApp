/**
 * Java 1. HomeWork 1
 *
 * @author MadMopuse
 * @version 24.03.2022 (fix after lesson two)
 *
 */



public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println(checkSumSign(5,3));
        System.out.println(checkSumSign(-3,3));
        System.out.println(checkSumSign(-3,1));
        printColor();
        compareNumbers();

    }
    //Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три
    //слова: Orange, Banana, Apple
    static void  printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");

    }
    //Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
    //инициализируйте их любыми значениями, которыми захотите. Далее метод должен
    //просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль
    //сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    static String checkSumSign(int a, int b) {

        return (a + b >= 0? "Сумма положительная" : "Сумма отрицательная");
    }
    //Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
    //ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен
    //вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100
    //включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    static void printColor() {
        int value = -10;
        if ( value <= 0) {
            System.out.println("Красный");
        }
        else if ( value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
        //System.out.println("Красный")
    }
    //Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и
    //инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то
    //необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    static void compareNumbers() {
        int a = 1;
        int b = 13;
            System.out.println(a >= b? "a >= b" : "a <= b");
    }
}