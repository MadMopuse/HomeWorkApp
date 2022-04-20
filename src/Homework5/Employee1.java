package Homework5;


import java.util.Arrays;

/**
 * Java 1. homework 5
 *
 * @author MadMopuse
 * @version 20.04.2022
 *
 */

public class Employee1 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];

        persArray[0] = new
                Employee(
                "Slava Neslavin",
                "Dir",
                "rtyui@mail.ru",
                "0123456789",
                100000,
                41
        );
        //System.out.println(Employee.getNumOfEmployees());

        persArray[1] = new
                Employee(
                "Fedor Nefedor",
                "Dir1",
                "rt1yui@mail.ru",
                "1123456789",
                200000,
                40
        );
        //System.out.println(Employee.getNumOfEmployees());

        persArray[2] = new
                Employee(
                "Peter NePeter",
                "PreDir",
                "rt2yui@mail.ru",
                "2123456789",
                50000,
                39
        );
        //System.out.println(Employee.getNumOfEmployees());

        persArray[3] = new
                Employee(
                "Oleg NeOleg",
                "PreDir1",
                "rt3yui@mail.ru",
                "3123456789",
                50000,
                22
        );
        //System.out.println(Employee.getNumOfEmployees());

        persArray[4] = new
                Employee(
                "Alla NeAlla",
                "PreDir2",
                "rt4yui@mail.ru",
                "4123456789",
                60000,
                43
        );
        //System.out.println(Employee.getNumOfEmployees());

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].showData();

            }
        }
    }
}
