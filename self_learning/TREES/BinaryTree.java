package TREES;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        private int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;

    //insert element
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("DO YOU WANT TO ENTER LEFT OF "+ node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("ENTER THE VALUE OF THE LEFT OF "+ node.value);
            int value= scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("DO YOU WANT TO INSERT INTO RIGHT OF "+ node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("ENTER THE VALUE OF THE RIGHT OF "+ node.value);
            int value= scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }
    public void display(){
        display(root, "");
    }
    private void display(Node node , String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public void preetyDisplay(){
        preetyDisplay(root,0);
    }
    private void preetyDisplay(Node node,int level){
        if(node == null){
            return;
        }
        preetyDisplay(node.right,level+1);

        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---->"+node.value);
        }else{
            System.out.println(node.value);
        }

        preetyDisplay(node.left,level+1);
    }


}
