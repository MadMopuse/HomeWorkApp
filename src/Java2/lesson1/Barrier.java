package Java2.lesson1;

public class Barrier {

    protected String name;
    protected Integer difficult;

    public Barrier(String name, Integer difficult) {
        this.name = name;
        this.difficult = difficult;
    }

    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
