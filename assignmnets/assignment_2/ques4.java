package assignment;

public class ques4 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void deleteFromNthNode(int n) {

        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int deletePos = size - n;

        Node prev = head;
        int i = 1;

        while (i < deletePos) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public static void main(String[] args) {

    }
}
