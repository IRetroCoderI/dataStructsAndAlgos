package queues;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
public class priorityQueues {
    public static void main(String[] args) {
        //Priority Queue
        Queue<String> line = new PriorityQueue<String>();
        line.offer("Ben");
        line.offer("Adam");
        line.offer("Daniel");
        line.offer("Chris");


        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.0);

        Queue<String> grades = new PriorityQueue<String>(Collections.reverseOrder());
        grades.offer("B");
        grades.offer("F");
        grades.offer("C");
        grades.offer("A");
        grades.offer("B");
        grades.offer("D");

        while(!grades.isEmpty()){
            System.out.println(grades.poll());
        }
    }
}
