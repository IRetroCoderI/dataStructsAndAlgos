package linkedLists;

import java.util.LinkedList;
public class linkylisty {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        Node a = new Node(7);
        Node b = new Node(4);
        Node c = new Node(56);
        Node d = new Node(44);
        Node e = new Node(83);
        Node f = new Node(32);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        int count = countNodes(a);
        System.out.println(count);



    }
    static int countNodes(Node current){
        int count = 1;
        while(current.hasNext()){
            if(current.hasNext()){
                count++;
                current = current.next;
            }
        }

        return count;
    }


}
