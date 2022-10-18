package trees;

public class Node {
    int data;
    Node leftChild;
    Node rightChild;
    String name;

    public void Node(int data, String name){
        this.data = data;
        this.name = name;
    }
    Node(int data, String name){
        this.data = data;
        this.name = name;
    }

    public String toString(){
        return name + " has key " + data;
    }

}
