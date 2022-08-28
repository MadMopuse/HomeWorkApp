package Java2.Java2lesson1;

public class Team {
    protected String name;
    protected TeamMember[] members;

    public Team(String name, TeamMember[] members) {
        this.name = name;
        this.members = members;
    }

    public void printAllMembers(){
        for (int i = 0; i < members.length; i++)

            System.out.println("info" + " " + members[i].getName() + " " + members[i].getPower());
    }

    public void showResults(){
        for (int i = 0; i < members.length; i++)
            if (members[i].getDone() == true)
            System.out.println(members[i].getName() + " " +"done");

    }


}
