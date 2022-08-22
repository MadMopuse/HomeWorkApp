package java1.Utilita;

/**
 * Java 1. Lesson 5 + 6
 *
 * @author MadMopuse
 * @version 02.05.2022 (Lesson 6)
 *
 */

//public - публичный, доступный из любой части прогрмаммы
//protected - защищенный/базовый, доступ только из того же самого package*a*, наследники класса
//default - защищенный/базовый, доступ только из того же самого package*a*
//private - приватный, доступ только внутри класса и нигде больше

public abstract class Employee {
    private String name;
    private int salary;
    private String profession;
    private int age;

    //employee1 -> numOfEmployees, employee2 -> numOfEmployees
    private static int numOfEmployees = 0;

    private final String company = "Cows&Dogs";


    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        //this.profession = profession;
        this.age = age;
        //System.out.println("Count of employee before changing " + numOfEmployees);
        numOfEmployees++;
        //System.out.println("Count of employee after changing " + numOfEmployees);
    }

    public static int getNumOfEmployees() {
        return numOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    public java1.Utilita.java1.Homework5.Employee(int num) { //конструктор - метод, который вызывается не на прямую, а когда создается новый экзмпляр класса
        System.out.println("The employee " + num + " is initialized" );
    }*/

    public abstract int getBonus(); /*{
        return (int) (salary * 1.5);
    }*/

}
