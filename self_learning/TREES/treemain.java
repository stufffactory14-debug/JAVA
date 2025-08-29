package TREES;

import java.util.Scanner;

public class treemain {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BinaryTree tree = new BinaryTree();
            tree.populate(scanner);
           // tree.display();
        tree.preetyDisplay();

    }
}
