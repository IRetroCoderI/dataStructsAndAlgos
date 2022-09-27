package stacks_and_queues;
import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<String> gamesCD = new Stack<String>();

        gamesCD.push("Skyrim");
        gamesCD.push("Fallout 4");
        gamesCD.push("Minecraft");
        gamesCD.push("Borderlands");
        gamesCD.push("Resident Evil");

        System.out.println(gamesCD.peek()); //"Peeks" into first object on stack
        gamesCD.pop(); //removes first object in stack
        System.out.println(gamesCD);

    }
}
