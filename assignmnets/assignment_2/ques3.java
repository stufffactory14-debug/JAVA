package assignment;

import java.util.LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ques3 {

    public static Node makeList(LinkedList<Integer> list) {
        if (list.size() == 0) return null;

        Node head = new Node(list.get(0));
        Node temp = head;

        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        return head;
    }

    public static Node getIntersection(Node a, Node b) {
        Node p = a;
        Node q = b;

        while (p != q) {
            p = (p == null) ? b : p.next;
            q = (q == null) ? a : q.next;
        }
        return p;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(9);
        list2.add(8);

        Node headA = makeList(list1);
        Node headB = makeList(list2);

        Node tempA = headA;
        tempA = tempA.next.next;

        Node tempB = headB;
        while (tempB.next != null) tempB = tempB.next;
        tempB.next = tempA;

        Node ans = getIntersection(headA, headB);

        if (ans != null)
            System.out.println("Intersection at node value: " + ans.val);
        else
            System.out.println("No Intersection");
    }
}
