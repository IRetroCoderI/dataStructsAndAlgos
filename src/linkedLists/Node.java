package linkedLists;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
    Node(){

    }
    boolean hasNext(){
        if (next!=null){
            return true;
        } else { return false; }
    }

}
