package linkedLists;
import java.util.LinkedList;
public class links {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.push("A"); //will behave as a stack (FILO)
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");
        System.out.println(list);

        LinkedList<String> q = new LinkedList<String>();
        q.offer("A"); //will behave as a queue
        q.offer("B");
        q.offer("C");
        q.offer("D");
        q.offer("F");
        q.add(4, "E");
        q.remove("F");

        System.out.println(q.indexOf("E"));
        System.out.println(q.get(4));
        System.out.println(q.contains("F"));
        System.out.println("First element is " + q.getFirst() + " and last element is " + q.getLast());
        q.addFirst("0");
        q.addLast("Z");
        System.out.println(q);

    }
}
