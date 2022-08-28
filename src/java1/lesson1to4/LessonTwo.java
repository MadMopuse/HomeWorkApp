package java1.lesson1to4;

/**
 * Java 1. LessonWork 2
 *
 * @author MadMopuse
 * @version 24.03.2022
 *
 */
class LessonTwo {
    public static void main(String[] args) {
        int[] arr  = new int[10];
        //for (int i = 0; i < 5; i++) {
        for (int i = 0; i < 10; i+=2) {    //i++ <-> i = i + 1
            System.out.println(i);
        }
        int a = 0;
        while (a < 100_000) {
            a = (a + 4) * a + 12;
            System.out.println(a);
        }
    }
}
