package queue;

public class queue_using_LL {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        static boolean isEmpty(){
            return head == null && tail == null;
        }

        static void addFirst(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }

            tail.next=newNode;
            tail=newNode;

        }
        static int removeFirst(){
            if (isEmpty()){
                System.out.println("QUEUE IS EMPTY");
                return -1;
            }
            int d = head.data;
            if(head==tail){
                head=tail=null;

            }else {
                head=head.next;
            }

            return d;
        }

        static int peek(){
            if(isEmpty()){
                System.out.println("QUEUE IS EMPTY");
                return -1;
            }
            return head.data;
        }
    }
    static void main(String[] args) {
        Queue q = new Queue();
        q.addFirst(1);
        q.addFirst(2);
        q.addFirst(3);
        q.addFirst(4);
        q.addFirst(5);
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
    }
}
