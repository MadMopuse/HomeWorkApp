package Java2.Java2lesson1.Java2lesson2;

public class lesson2 {/**
 * Java 2. HomeLesson1
 *
 * @author MadMopuse
 * @version 20.08.2022 HomeLesson1
 *
 */

    public static void main(String[] args) {

        String[][] values = {
                {"1", "2", "3", "4"},
                {"-1", "-2", "-3", "-4"},
                {"-1", "-2", "-3", "-4"},
                {"-1", "-2", "-3", "-4"},
        };

    /*    String[][] values = {
                {"1", "2", "i", "4"},
                {"-1", "-2", "-3", "-4"},
                {"-1", "-2", "-3", "-4"},
                {"-1", "-2", "-3", "-4"},
        };

     */

        /*     String[][] values = {
                {"1", "2", "3",},
                {"-1", "-2", "-3",},
                {"-1", "-2", "-3",},
                {"-1", "-2", "-3",},
        };

     */

        try {
            System.out.println("Sum of elements: " + sumArrayElements(values));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


    }
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("need 4x4, real " + array.length + "x" + array[0].length);
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += transferStringToInt(array[i][j], i , j);
            }
        }
        return sum;
    }

    public static int transferStringToInt(String element, int i, int j) throws MyArrayDataException {
        try {
            return Integer.valueOf(element);
        } catch (NumberFormatException numberFormatException){
            throw new MyArrayDataException("Cell conversion failed, cell coordinate is [" + i + "; " + j + "]");
        }
    }
}
