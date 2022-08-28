package java1.Lesson7;

/**
 * Java 1. Lesson 7
 *
 * @author MadMopuse
 * @version 03.05.2022 (Homework7)
 *
 */

public class Cat {

     private String name;
     private int appetite;
     private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eatFood(Plate plate) {
        satiety = plate.looseFood(appetite);
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("[" + name + ", " + appetite + "]");
    }
}
