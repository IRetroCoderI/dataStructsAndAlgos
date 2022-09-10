package classes_and_objects;

public class main {
    public static void main(String[] args) {
        Robo robot1 = new Robo();
        robot1.color = "red";
        robot1.name = "Tom";
        robot1.weight = 40;

        Robo robot2 = new Robo("Jerry", 60, "blue");
        Person p1 = new Person("Harry", "aggressive", false);
        p1.robotOwned = robot2;
        robot2.friendsWith = robot1;
        robot1.friendsWith = robot2;
        p1.robotOwned.friendsWith.introduceSelf();

        p1.robotOwned.introduceSelf();
    }
}
