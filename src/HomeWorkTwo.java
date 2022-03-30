/**
 * Java 1. HomeWork 2
 *
 * @author MadMopuse
 * @version 27.03.2022 (Home work №2)
 *
 */
public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(isSumBetween10and20( 0, 20)); // использовалось для проверки в консоли, перед коммитом
        //законментить или удалить //в условии не сказанно вызывать из main
        negativeOrPositiveWithIn0( 5); //в условии не сказанно вызывать из main
        System.out.println(positiveOrNegative( 0));//в условии не сказанно вызывать из main
        printStringsNumberTimes("Stroca", 5 );//в условии не сказанно вызывать из main
        System.out.println(countLeapYear(1000));//в условии не сказанно вызывать из main
    }
    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    //(включительно), если да – вернуть true, в противном случае – false.
    static boolean isSumBetween10and20(int a, int b) {
        return (a + b >= 10 & a + b <= 20); // если одно из значений будет false - return вернет false
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void negativeOrPositiveWithIn0(int a) {
        System.out.println(a >= 0? "Сумма положительная" : "Сумма отрицательная");
    }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    //если число отрицательное, и вернуть false если положительное.
    static boolean positiveOrNegative(int a) {//нет указаний про +/-0, но так же принимаю что 0 положительный
        return (a < 0);
    }

    //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    //указанную строку, указанное количество раз;
    static void printStringsNumberTimes( String a, int b ) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    // * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    //не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
    //при этом каждый 400-й – високосный.
    static boolean countLeapYear(int a) {
        return (a % 4 == 0 & (a % 100 !=0 || a % 400 == 0));
    }
}
