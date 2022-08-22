package java1.Lesson6;

/**
 * Java 1. Lesson 6
 *
 * @author MadMopuse
 * @version 02.05.2022 (HomeWork 6)
 *
 */

public class Main {
    public static void main(String[] args) {
        DogAnimal animal1 = new DogAnimal("Dog", "Bobik", 5);
            animal1.getLongOfRun(50);

        CatAnimal animal2 = new CatAnimal("cat", "Pushistik", 6);
            animal2.getLongOfSwim(10);
            animal2.getLongOfRun(150);

        DogAnimal animal3 = new DogAnimal("Dog", "Шарик", 5);
            animal3.getLongOfSwim(10);
            animal3.getLongOfRun(550);

        Animals animal4 = new CatAnimal("cat", "Pushistik", 6);
            animal4.getLongOfSwim(10);
            animal4.getLongOfRun(150);

        countOfAnimals();
    }

    public static void countOfAnimals() {
        System.out.println("Количество животных: " + Animals.getNumOfAnimals());
        System.out.println("Количество псов: " + DogAnimal.getNumOfDogs());
        System.out.println("Количество котов: " + CatAnimal.getNumOfCats());
    }

}
