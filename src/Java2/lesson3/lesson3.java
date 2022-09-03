package Java2.lesson3;

import java.util.Arrays;

public class lesson3 {
    /**
     * Java 2. HomeLesson3
     *
     * @author MadMopuse
     * @version 22.08.2022 HomeLesson3
     */

    public static void main(String[] args) {
        //Задача 2
        Box box1 = new Box();
        for (int i = 0; i < 10; i++ ) {
            box1.addFruits(new Apple());
        }
        box1.addFruits(new Orange());

        System.out.println("weight of box1 = " + box1.getWeightBox());

        Box box2 = new Box();
        for (int i = 0; i < 6; i++){
            box2.addFruits(new Orange());
        }

        if (box1.compare(box2))
            System.out.println("weight of box1 = weight box2");
        else System.out.println("weight of box1 != weight box2");

        Box box3 = new Box();

        box1.outAllFruits(box3);
        System.out.println("weight of box1 = " + box1.getWeightBox() +"\n" + "weight of box3 = " + box3.getWeightBox());

        String[] values = {"1", "2", "s"};
        changeValue(values, 0, 2);

        Integer[] values2 = {10, 20, 30};
        changeValue(values2, 0, 2);

    }

// Задача 1
    private static <T> void changeValue(T[] values, int i, int i1) {
        T temp = values[i];
        values[i] = values[i1];
        values[i1] = temp;
        System.out.println(Arrays.toString(values));
    }





}
