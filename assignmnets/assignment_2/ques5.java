package assignment;

public class ques5 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node merge(Node a, Node b) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        if (a != null) temp.next = a;
        if (b != null) temp.next = b;

        return dummy.next;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);

        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);

        Node head = merge(a, b);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
