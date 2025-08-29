package linkedlist;

public class DOUBLYLINKEDLIST {

    private Node head;
    private int size;

    public DOUBLYLINKEDLIST() {
        this.size = 0;
    }
    public void insertfist(int val){
        Node node=new Node(val);
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }
    public void display(){
        Node temp = head;
        Node tail=null;
        while(temp!=null){
            System.out.print(temp.val + "->");
            tail=temp;
            temp=temp.next;

        }
        System.out.println("END");
        System.out.println("PRINT IN REVERSE");
        while(tail!=null){
            System.out.print(tail.val+"->");
            tail=tail.prev;
        }
        System.out.println("START");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }

    public void insert(int after , int val){
        Node p=find(after);
        if(p==null){
            System.out.println("node not exist");
            return;
        }
        Node node= new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }

    }
    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }




    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
