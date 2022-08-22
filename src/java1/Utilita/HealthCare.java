package java1.Utilita;

public interface HealthCare {

    int getBolnichniye(int days);

    int getDmsMoney();

    default void doSmth() {
        sayHelloy();
    }

    private  void sayHelloy() {
        System.out.println("hello");
    }

}
