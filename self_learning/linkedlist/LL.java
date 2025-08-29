package linkedlist;
//CYCLE RETECTION ( FAST AND SLOW POINTER )
//REVERSAL OF LINK LIST ( INPLACE REVERSAL OF LL )
//TWO POINTERS THATS IT
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public void insertend(int val) {
        if (tail == null) {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertend(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        int val = tail.next.val;
        tail.next = null;

        size--;
        return val;
    }

    public int deleteIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public String toString() {
            return "Node(" + val + ")";
        }
    }

    //QUESTION
    //LEETCODE REMOVE DUPLICATES
    public void duplicate() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }


    //merge
    public static LL merge(LL first, LL second) {
        LL ans = new LL();
        Node f = first.head;
        Node s = second.head;
        while (f != null && s != null) {
            if (f.val == s.val) {
                ans.insertend(f.val);
                ans.insertend(s.val);
                f = f.next;
                s = s.next;
            } else if (f.val < s.val) {
                ans.insertend(f.val);
                f = f.next;
            } else if (f.val > s.val) {
                ans.insertend(s.val);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertend(f.val);
            f = f.next;

        }
        while (s != null) {
            ans.insertend(s.val);
            s = s.next;
        }

        return ans;
    }


    //IF CYCLE PRESENT IN LINKED LIST OR NOT ( LEETCODE 141 )
    public boolean hasCycle(LL linklist) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    //FIND LENGTH OF THE CYCLE
    public int lengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int length = 0;
                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }


    //LEETCODE CYCLE START INDEX (142)
    public Node detectCycle(Node head) {
       /* int length=0;
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=lengthOfCycle(slow);
                break;
            }
        }*/
        Node fast = head;
        Node slow = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {

                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }
        //FIND THE START NODE
        Node f = head;
        Node s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }

        //keep moving both foward and they will meet at cycle start
        while (s != f) {
            f = f.next;
            s = s.next;
        }
        return s;
    }


    //202. Happy Number(google question)
    public static boolean happyNum(int n) {
        int f = n;
        int s = n;
        do {
            f = square(square(f));
            s = square(s);
        } while (f != s);
        if (s == 1) {
            return true;
        }
        return false;

    }
    private static int square(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public Node get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    //BUBBLESORT USING RECURSION
    public void bubblesort() {
        bubblesort(size - 1, 0);
    }
    private void bubblesort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);
            if (first.val > second.val) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = null;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubblesort(row, col + 1);
        } else {
            bubblesort(row - 1, 0);
        }
    }


    // REVERSAL OF LINKEDLIST USING RECURSION
    public void reverseLL() {
        reverseLLHelper(head);
    }
    public void reverseLLHelper(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverseLLHelper(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    //LEETCODE 206 ( INPLACE REVERSAL OF LL ASKED IN GOOGLE , AMAZON, MICROSOFT AND IN MANY COMPANIE)
    //KEY APPROACH( DRAW INPUT LL AND DRAW OUTPUT LL AND TAKE 3 NODE PREV PRESENT AND NEXT THEN JUST APPLY HOW LL LOOKS LIKE IN OUTPUT)
    public void inplacereverseLL(){
        head=inplacereverseLL(head);
    }
    private Node inplacereverseLL(Node head) {
        if (size < 2) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
       return prev;
    }


    //LEETCODE 92 asked in many companies 1 2 3 4 5 output 1 4 3 2 5
    public void reverseBetween(){
        reverseBetween(head,2,4);
    }
    private  Node reverseBetween(Node node, int left, int right) {
        if (left == right) {
            return head;
        }
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node newend = current;
        // reversal
        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }

        }
        if (last != null) {
            last.next = prev;

        } else {
            head = prev;
        }
        newend.next = current;
        return head;
        
    }


    public void middlenode(){
        middleNode(head);
    }
    //MIDDLE NODE IN LINKED LIST
    private Node middleNode(Node head){
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

        }
        return s;
    }


//palendromic linkedlist LEETCODE 234 ASKED IN MANY COMPANIES AND IT'S VERY SIMPLE ( TRY ON PEN PAPAR ) reverse half ll then compare head with second head
    public void ispalendrome(){
        if (ispalendrome(head)) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is NOT a palindrome.");
        }

    }
    private boolean ispalendrome(Node head){
        Node mid = middleNode(head);
        Node headsecond=inplacereverseLL(mid);
        Node rereverseHead=headsecond;
        //compare both the halves
        while(head!=null && headsecond!=null){
            if(head.val!= headsecond.val){
                break;
            }
            head=head.next;
            headsecond=headsecond.next;
        }

        inplacereverseLL(rereverseHead);
        if(head==null || headsecond==null){
            return true;
        }
        return false;
    }


// https://leetcode.com/problems/reorder-list/description/
    // ASKED IN GOOGLE , FB PROB 143
    public void reorderList(Node head) {
        if(head==null || head.next==null){
            return;
        }
        Node mid = middleNode(head);
        Node headfirst=head;
        Node headsecond = inplacereverseLL(mid);
        while(headfirst!=null && headsecond!=null){
            Node temp=headfirst.next;
            headfirst.next=headsecond;
            headfirst=temp;
            Node temp2=headsecond.next;
            headsecond.next=headfirst;
            headsecond=temp2;
        }
        if(headfirst!=null){
            headfirst.next=null;
        }
    }
}
