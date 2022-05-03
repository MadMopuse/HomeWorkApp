package Lesson7;

/**
 * Java 1. Lesson 7
 *
 * @author MadMopuse
 * @version 03.05.2022 (Homework7)
 *
 */

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean looseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
            return true;
        }
        return false;
    }

    public void addFood(int food) {
        this.food += food;
    }


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("[" + food + "]");
    }
}
