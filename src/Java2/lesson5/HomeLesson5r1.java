package Java2.lesson5;

import java.util.Arrays;

/**
 * Java 2. HomeLesson5
 *
 * @author MadMopuse
 * @version 18.09.2022 HomeLesson5
 */

public class HomeLesson5r1 {

    public static void main(String[] args) {
        AppData1 data = new AppData1();
        data.readFromFile("rtyhet.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.saveAppData("rtyhetTEST.csv");
    }

}
