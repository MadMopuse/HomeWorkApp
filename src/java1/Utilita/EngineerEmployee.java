package java1.Utilita;

/**
 * Java 1. Lesson 6
 *
 * @author MadMopuse
 * @version 01.05.2022 (Lesson 6)
 *
 */

public class EngineerEmployee extends Employee implements HealthCare {

    private  int fixedItems;
        public EngineerEmployee(String name, int salary, int age) {
            super(name, salary, age);
            this.setProfession("Engineer");
            fixedItems = 0;
        }

    @Override
    public int getBonus() {
        return (int) (this.getSalary() * 1.5) + (fixedItems * 300);
    }

    public int getBonus(int extraBonus) {
        return (int) (this.getSalary() * 1.5 + fixedItems * 300 + extraBonus);
    }

    public int getFixedItems() {
        return fixedItems;
    }

    public void setFixedItems(int fixedItems) {
        this.fixedItems = fixedItems;
    }


    @Override
    public int getBolnichniye(int days) {
        return 1000 * days;
    }

    @Override
    public int getDmsMoney() {
        return 30000;
    }
}

