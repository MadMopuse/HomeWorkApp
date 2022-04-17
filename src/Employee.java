/**
 * Java 1. Lesson 4
 *
 * @author MadMopuse
 * @version 16.04.2022 (Lesson 5)
 *
 */

public class Employee {
    private String name;
    private int salary;
    private String profession;
    private int age;


    public Employee(String name, int salary, String profession, int age) {
        this.name = name;
        this.salary = salary;
        this.profession = profession;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    /*
    public Employee(int num) { //конструктор - метод, который вызывается не на прямую, а когда создается новый экзмпляр класса
        System.out.println("The employee " + num + " is initialized" );
    }*/

    public  int getBonus() {
        return (int) (salary * 1.5);
    }
}
