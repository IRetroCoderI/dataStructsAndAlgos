package queues;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueues {
    public static void main(String[] args) {
        Queue<String> line = new PriorityQueue<String>();
        line.offer("Ben");
        line.offer("Adam");
        line.offer("Daniel");
        line.offer("Chris");

        System.out.println(line.toString());
    }
}
