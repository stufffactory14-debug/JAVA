package assignment;

public class ques7 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverseK(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroup = dummy;

        while (true) {
            Node kth = prevGroup;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break;

            Node groupNext = kth.next;
            Node prev = groupNext;
            Node curr = prevGroup.next;

            while (curr != groupNext) {
                Node nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            Node temp = prevGroup.next;
            prevGroup.next = prev;
            prevGroup = temp;
        }

        return dummy.next;
    }

    public static void printList(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int k = 3;

        head = reverseK(head, k);

        printList(head);
    }
}
