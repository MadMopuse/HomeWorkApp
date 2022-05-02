package Lesson6;

public class DogAnimal  extends Animals{

    public DogAnimal(String species,String name,int age) {
        super (species, name, age);
        this.setSpecies("Dog");
        numOfDogs++;
    }

    private static int numOfDogs = 0;
    private static final int MAX_RUN_LONG = 500;
    private static final int MAX_SWIM_LONG = 10;

    public void getLongOfRun(int metre) {
        if (metre <= MAX_RUN_LONG & metre > MIN_LONG) {
            System.out.println("Пес " + this.name + " пробежал " + metre);
        } else if (metre <= MIN_LONG) {
            System.out.println(EXCEPTION_NEGATIVE_VALUE);
        } else {
            System.out.println("Пес " + this.name + " не может пробежать больше " + MAX_RUN_LONG + " метров");
        }
    }

    public void getLongOfSwim(int metre) {
        if (metre <= MAX_SWIM_LONG & metre > MIN_LONG) {
            System.out.println("Пес " + this.name + " проплыл " + metre);
        } else if (metre <= MIN_LONG) {
            System.out.println(EXCEPTION_NEGATIVE_VALUE);
        } else {
            System.out.println("Пес " + this.name + " не может проплыть больше " + MAX_SWIM_LONG + " метров");
        }
    }

    public static int getNumOfDogs() {
        return numOfDogs;
    }
}
