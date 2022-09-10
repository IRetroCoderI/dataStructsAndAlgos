package classes_and_objects;

public class main {
    public static void main(String[] args) {
        robo robot1 = new robo();
        robot1.color = "red";
        robot1.name = "Tom";
        robot1.weight = 40;

        robo robot2 = new robo("Jerry", 60, "blue");

        robot1.introduceSelf();
        robot2.introduceSelf();
    }
}
