package java1.Lesson6;

/**
 * Java 1. Lesson 6
 *
 * @author MadMopuse
 * @version 02.05.2022 (HomeWork 6)
 *
 */

public abstract class Animals implements AnimalsCanDo{
    protected String species;
    protected String name;
    protected int age;

    private static int numOfEAnimals = 0;

    public Animals(String species,String name,int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        numOfEAnimals++;
    }

    protected static final String EXCEPTION_NEGATIVE_VALUE = "Используются только положительные числа";

    protected static final int MIN_LONG = 0;

    public static int getNumOfAnimals() {
        return numOfEAnimals;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
