package java1.Utilita;

/**
 * Java 1. Lesson 5 + 6
 *
 * @author MadMopuse
 * @version 01.05.2022 (Lesson 6)
 *
 */

public class lesson5 {
    public static void main(String[] args) {

        // Классы/объекты -> Принципы ООП:
        // Инкапсульяция (модификаторы доступа, static, final)
        // Полиформизм (переопределени методовб перегрузка методов) ((Generics/Обобщения))
        // Наследование
        // Абстрацкия (Классы, Абстрактные методы/классы, интерфейсы)


        EngineerEmployee employee1 = new
                EngineerEmployee("Slava", 100000, 34);


        SalesmanEmployee employee2 = new
                SalesmanEmployee("Leonid", 150000, 36);


        /*Employee employee3 = new
                Employee("Vasya", 200000, "middle QA Engineer", 40);
                */

        employee1.setFixedItems(5);
        employee2.setSales(5); // премия + бонус

        employee1.doSmth();

        System.out.println(employee1.getBonus());
        System.out.println(employee2.getBonus());
        System.out.println(employee1.getName() + " " + employee2.getName());
        System.out.println(employee1.getProfession() + " " + employee2.getProfession());




    }



}