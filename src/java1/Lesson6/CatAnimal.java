package java1.Lesson6;

public class CatAnimal extends Animals{

    public CatAnimal(String species, String name, int age) {
        super(species, name, age);
        this.setSpecies("Cat");
        numOfCats++;
    }

    private static int numOfCats = 0;
    private static final int MAX_RUN_LONG = 200;
    private static final int MIN_RUN_LONG = 0;
    private static final int MAX_SWIM_LONG = 0;

    public void getLongOfRun(int metre) {
        if (metre <= MAX_RUN_LONG & metre > MIN_LONG) {
            System.out.println("Кот " + this.name + " пробежал " + metre);
        } else if (metre <= MIN_LONG) {
            System.out.println(EXCEPTION_NEGATIVE_VALUE);
        } else {
            System.out.println("Кот " + this.name + " не может пробежать больше " + MAX_RUN_LONG + " метров");
        }
    }

    public void getLongOfSwim(int metre) {
        System.out.println("Кот " + this.name + " не умеет плавать");
    }

    public static int getNumOfCats() {
        return numOfCats;
    }


}
