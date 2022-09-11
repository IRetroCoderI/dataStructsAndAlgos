package trees;

public class trees {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(find_sum(a));


    }
    static int find_sum(Node root){
        int sum = 0;
        if(root == null){
            return 0;
        } else {
            return root.data + find_sum(root.left) + find_sum(root.right);
        }
    }
}
