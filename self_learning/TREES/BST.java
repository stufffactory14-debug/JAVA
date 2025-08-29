package TREES;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value=value;
        }
        public int getValue() {
            return value;
        }
    }

    private Node root;
    public BST(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;

    }
    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){

    }
    //REAMING
    private void insert(int value,Node node){
        if(value<node.value){

        }
    }

    public void display(){
        display(root,"ROOT NODE : ");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"LEFT CHILD OF " + node.getValue() + " : ");
        display(node.right,"RIGHT CHILD OF " + node.getValue() + " : ");
    }
}
