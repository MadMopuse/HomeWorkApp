package Utilita;

public class ProgrammerEmployee extends Employee implements HealthCare {
    public ProgrammerEmployee(String name, int salary, int age) {
        super(name, salary, age);
    }

    @Override
    public int getBonus() {
        return 0;
    }


    @Override
    public int getBolnichniye(int days) {
        return 0;
    }

    @Override
    public int getDmsMoney() {
        return 0;
    }
}
