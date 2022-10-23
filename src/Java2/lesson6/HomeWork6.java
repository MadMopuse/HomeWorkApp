package Java2.lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.util.Scanner;

public class HomeWork6 {

    public static int CURRENT_DAY = 1;
    public static int FIVE_DAYS = 5;
    public static int EXIT_OF_PROCESS = 0;



    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input: \n 1 - today weather \n 5 - weather for five days \n 0 - for exit");

            if (scanner.hasNextInt()) {
                Integer countDay = scanner.nextInt();
                if (countDay.equals(EXIT_OF_PROCESS)) {
                    System.exit(0);
                } else if (countDay.equals(CURRENT_DAY) || countDay.equals(FIVE_DAYS)) {
                    WeatherProcessor.getWeather(countDay);
                } else {
                    System.out.println("You text " + countDay + "\nRestart and try 1 or 5 or 0. ");
                }
            } else {
                System.out.println("Restart and try 1 or 5 or 0. ");

            }
        }
    }
}
