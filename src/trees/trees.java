package trees;

public class trees {
    public static void main(String[] args) {

    }
    static int find_sum(Node root){
        int sum = 0;
        if(root == null){
            return 0;
        } else {
            return root.data + find_sum(root.leftChild) + find_sum(root.rightChild);
        }
    }
}
