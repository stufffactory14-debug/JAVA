package linkedlist;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        size++;
        Node temp = new Node(data);
        if(head==null){
            head=tail=temp;
            return;
        }
            temp.next = head;
            head.prev = temp;
            head = temp;

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void removeLast(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        size--;

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        size--;
        if(head==tail){
            head=tail=null;
        }

        head=head.next;
        head.prev=null;

    }

    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    
    static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        dll.removeLast();
        dll.deleteFirst();
        dll.print();
        System.out.println(dll.size);
    }
}

