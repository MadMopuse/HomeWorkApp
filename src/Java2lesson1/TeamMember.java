package Java2lesson1;

public class TeamMember {

    protected String name;
    protected Integer power;
    protected Boolean done;

    public TeamMember(String name, Integer power) {
        this.name = name;
        this.power = power;
        this.done = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }




}
