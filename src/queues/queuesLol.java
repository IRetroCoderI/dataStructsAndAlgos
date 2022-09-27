package queues;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.*;
public class queuesLol {
    public static void main(String[] args){
        Queue<String> starbucksLine = new LinkedList<String>();

        starbucksLine.offer("Chad");
        starbucksLine.offer("Karen");
        starbucksLine.offer("James");
        starbucksLine.offer("Jesus");
        starbucksLine.offer("Miguel");
        System.out.println("People in line: " + starbucksLine.size() + " " + starbucksLine);

        System.out.println("Order for " + starbucksLine.poll());
        System.out.println("Next in line: " + starbucksLine.peek());
        System.out.println("People in line: " + starbucksLine);

        System.out.println(starbucksLine.contains("Karen"));


    }

}
