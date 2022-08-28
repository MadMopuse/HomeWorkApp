package Java2.Java2lesson1;

public class Course {
    protected Barrier[] barriers;

    public Course(Barrier[] barriers) {
        this.barriers = barriers;
    }

    public void doIt(Team team){
        for (int i = 0; i < team.members.length; i++) {
            int count = 0;
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j].getDifficult() < team.members[i].getPower()) {
                    count = count+1;
                }
            }
                if (count == barriers.length) {
                team.members[i].setDone(true);
            }
        }
    }
}
