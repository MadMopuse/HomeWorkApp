package Java2lesson1;

/**
 * Java 2. HomeLesson1
 *
 * @author MadMopuse
 * @version 06.08.2022 HomeLesson1
 *
 */

public class HomeLesson1 {

    public static void main(String[] args) {
        Barrier[] barriers = new Barrier[4];
        barriers[0] = new Barrier("swim", 5);
        barriers[1] = new Barrier("run", 3);
        barriers[2] = new Barrier("jump", -3);
        barriers[3] = new Barrier("bicycle", 4);

        Course c = new Course(barriers);

        TeamMember[] members = new TeamMember[7];
        members[0] = new TeamMember("m1", -5);
        members[1] = new TeamMember("m2", 10);
        members[2] = new TeamMember("m3", 2);
        members[3] = new TeamMember("m4", -3);
        members[4] = new TeamMember("m5", 5);
        members[5] = new TeamMember("m6", 4);
        members[6] = new TeamMember("m7", 6);

        Team t = new Team("T1", members);

        t.printAllMembers();
        c.doIt(t);
        t.showResults();



    }



}