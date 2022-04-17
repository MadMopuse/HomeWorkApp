/**
 * Java 1. Lesson 4
 *
 * @author MadMopuse
 * @version 16.04.2022 (Lesson 5)
 *
 */

public class lesson5 {
    public static void main(String[] args) {

        Employee employee1 = new
                Employee("Slava", 100000, "QA Engineer", 34);

        Employee employee2 = new
                Employee("Leonid", 150000, "middle QA Engineer", 36);
        //employee2.salary = 15000; //не санкционированный доступ к данным

        System.out.println(employee1.getName() + " " + employee2.getName());
        System.out.println(employee1.getBonus());
        System.out.println(employee2.getBonus());

    }

    /*public static int getBonus(int salary) {
        return (int) (salary * 1.5); //(((double) salary) * 1.5);
    }*/


}
