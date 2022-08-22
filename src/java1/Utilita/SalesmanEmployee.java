package java1.Utilita;

/**
 * Java 1. Lesson 6
 *
 * @author MadMopuse
 * @version 02.05.2022 (Lesson 6)
 *
 */

public class SalesmanEmployee extends Employee{

    private int sales;
        public SalesmanEmployee(String name, int salary, int age) {
            super(name, salary, age);
            this.setProfession("Salesman");
            sales = 0;
        }

    @Override
    public int getBonus() {
        return (int) (this.getSalary() * 1.5 + sales * 3000);
    }

            //переопределить метод - полиморфизм
    public int getBonus(int extraBonus) {
        return (int) (this.getSalary() * 1.5 + sales * 3000 + extraBonus);
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
