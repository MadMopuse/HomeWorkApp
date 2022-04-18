package Utilita;

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
        System.out.println(Employee.getNumOfEmployees());

        Employee employee2 = new
                Employee("Leonid", 150000, "middle QA Engineer", 36);
        System.out.println(Employee.getNumOfEmployees());
        //employee2.salary = 15000; //не санкционированный доступ к данным

        Employee employee3 = new
                Employee("Vasya", 200000, "middle QA Engineer", 40);
        System.out.println(Employee.getNumOfEmployees());

        employee2.setName("Anton");

        System.out.println
                (employee1.getName() + " " + employee2.getName() + " " + employee3.getName());
        System.out.println(employee1.getBonus());
        System.out.println(employee2.getBonus());

        //String <-> Employee

        String  s1 = "s";
        String  s2 = "ss";

        String[] strings = {s1, s2};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        Employee[] employees = {employee1, employee2, employee3};
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }

        System.out.println(employee1.getNumOfEmployees());
        System.out.println(employee2.getNumOfEmployees());
    }

    /*public static int getBonus(int salary) {
        return (int) (salary * 1.5); //(((double) salary) * 1.5);
    }*/


}