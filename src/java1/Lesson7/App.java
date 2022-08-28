package java1.Lesson7;

/**
 * Java 1. Lesson 7
 *
 * @author MadMopuse
 * @version 03.05.2022 (Homework7)
 *
 */

public class App {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Baksik", 25, false);
        cats[1] = new Cat("Bob", 10, false);
        cats[2] = new Cat("Kisun", 25, false);
        cats[3] = new Cat("Sam", 20, false);
        cats[4] = new Cat("Sam1", 10, false);

        Plate plate = new Plate(30);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFood(plate);
            System.out.println(cats[i].getName() + " " + cats[i].isSatiety() );
            plate.info();
            if (cats[i].isSatiety() == false) {
                plate.addFood(50);
                plate.info();
            }
        }
    }
}
