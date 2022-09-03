package Java2.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /**
     * Java 2. HomeLesson4
     *
     * @author MadMopuse
     * @version 03.09.2022 HomeLesson4
     */

    public static void main(String[] args) {
        // 1 задание
        ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList("qwe", "qwe", "wer", "wad", "qse", "ewq", "wad", "jf", "fljhgb", "jbfj"));

        Map<String, Integer> words = new HashMap<>();

        for (String word : listOfWords){
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            }
            else{
                words.putIfAbsent(word, 1);
            }
        }
        System.out.println(words);

        // 2 задание
        PhoneList test = new PhoneList();
        test.add("Ivanov", "/*-85+64");
        test.add("Ivanov", "/*-85+64+");
        test.add("ivanov", "/*-85+64+1");

        System.out.println(test.get("vanov"));
        System.out.println(test.get("Ivanov"));
        System.out.println(test.get("ivanov"));
    }
}
