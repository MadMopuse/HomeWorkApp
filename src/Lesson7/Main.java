package Lesson7;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Locale;

/**
 * Java 1. Lesson 7
 *
 * @author MadMopuse
 * @version 03.05.2022
 *
 */

public class Main {
    public static void main(String[] args) {

        String  s = "Hello";
        String s1 = new String("fdsgds");
        String  s2 = new String(new char[]{'a', 'b'});
        String s3 = new String(new byte[]{97, 98}, StandardCharsets.ISO_8859_1);//-128, 127 -> 256 символов
        String s4 = s3;

        //System.out.println(s2);
        //System.out.println(s3);
        //System.out.println(s4);

        //System.out.println(s3 + s2);


        String message = "[Slava, Leonid, Vsevolodiy]";
        System.out.println(message.substring(1, message.length()-1));
        String[] users = message.replaceAll("\\["," ")
                .replaceAll("\\]"," ")
                .toLowerCase(Locale.ROOT)
                .split(", ");
        System.out.println(message + "[" + (15000 + 5000) + "...");

        //sout -> работает только со строками - все превращает в строки

        String word1 = "Hello";
        String word2 = new String("Hello");// а тут создается объект
        System.out.println(word1 == word2); // Объект == Объект - сравниваются выходы на ячейки памяти

        //Пул строк {[Hello], [Word], ...} - не создается дубликатов строк и сравнивается есть ли уже такой
        //word1 => пул строк
        //word2 => неоптимезированно ссылает на объект в памяти новый у которого значение String



        //s2 + s3
        //[1, 2, 3] + [4,5]
        //1) создать массив 3+2=5 элементов пустой
        //2) перенести данные из первого массива в новый
        //3) перенести данные из второго массива в новый
        //4) убрать за собой
        //14:50 -> 14:55 => 14:55 - 14:50

        long startTime = System.currentTimeMillis();
        String test = "gdsfjk";
        StringBuilder stringBuilder = new StringBuilder(test);
        for (int i = 0; i < 50000; i++) {
            stringBuilder.append("Hellow");
        }
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);


        //System.out.println(message.replaceAll("o", "!"));//[Slava, Leonid, Vsevolodiy]

        //System.out.println(message.toUpperCase(Locale.ROOT));
        //System.out.println(message.toLowerCase(Locale.ROOT));
        //System.out.println(message.contains("Hello"));


        //char a = 'a';
        //System.out.println(a-1);

    }
}

