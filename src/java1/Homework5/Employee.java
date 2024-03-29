package java1.Homework5;

/**
 * Java 1. homework 5
 *
 * @author MadMopuse
 * @version 20.04.2022
 *
 */

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    private static int numOfEmployees = 0;

    public void showData() {
        System.out.println("Имя и Фамилия: " + fullName + "\nДолжность: " + position + "\nemail: "
                + email + "\nНомер телефона: " + phoneNumber + "\nЗП: " + salary + "\nВозраст: " + age + "\n");
    }

    private final String company = "It is not necessary";

    public Employee
            (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        numOfEmployees++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumOfEmployees() {
        return numOfEmployees;
    }
}