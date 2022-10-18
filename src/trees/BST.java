package trees;

public class BST {

    public Node root;
    String name;

    public void addNode(int data, String name){
        Node newNode = new Node(data, name);

        if(root == null){
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while(true){
                parent = focusNode;

                if(data < focusNode.data){
                    focusNode = focusNode.leftChild;

                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    public Node findNode(int data){
        Node focusNode = root;
        while(focusNode.data != data){
            if(data < focusNode.data){
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null){
                return null;
            }
        }
        return focusNode;
    }
    public void orderedTraversal(Node focusNode){
        if (focusNode != null){
            orderedTraversal(focusNode.leftChild);
            System.out.println(focusNode);
            orderedTraversal(focusNode.rightChild);

        }
    }
    public void preorderedTraversal(Node focusNode){
        if (focusNode != null){
            System.out.println(focusNode);
            orderedTraversal(focusNode.leftChild);
            orderedTraversal(focusNode.rightChild);
        }
    }
    public void postOrderedTraversal(Node focusNode){
        if(focusNode != null){
            postOrderedTraversal(focusNode.leftChild);
            postOrderedTraversal(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

}
