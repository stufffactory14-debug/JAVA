
public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node tail;
    public static Node head;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }

        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail=head=newNode;
        }

        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty !");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i=0;
        Node newNode = new Node(data);
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    public void removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty !");
            return;
        }else if(size==1){
            head=tail=null;
            return;
        }
        Node temp = head;
        head=temp.next;
        size--;
    }

    public void removeLast(){
        if(size==0){
            System.out.println("LinkedList is empty !");
            return;
        }else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node temp=head;
        int i=0;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    public int searchIterative(int data){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==data){
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }

    public int helper(int data,Node head){
        if(head==null){
            return -1;
        }
        if(head.data==data){
            return 0;
        }

        int index=helper(data,head.next);
        if(index==-1){
            return -1;
        }
        return index+1;

    }

    public int recursiveSearch(int data){
        return helper(data,head);
    }

    public void reverseLinkedList(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteFromNthNode(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;

        }
        if(n==size){
            head=head.next; // remove first
            return;
        }

        int delete=size-n;
        Node prev=head;
        int i=1;
        while(i<delete){
            i++;
            prev=prev.next;
        }
        prev.next=prev.next.next;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){

        if(head==null || head.next==null){
            return true;
        }

        // step 1 find mid(made function)
        Node midNode = findMid(head);
        //step 2 reverse 2nd half after mid
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }                                                 
        Node right = prev;//head of right half
        Node left=head;
        //step 3 check the value of node till any node become null
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }

     public boolean cycle(){
        Node slow =head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }

    public void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }

        if(cycle) {
            Node prev=null;
            slow = head;
            while (fast != slow) {
                prev = fast;
                fast = fast.next;
                slow = slow.next;

            }
            if (prev == null) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            } else {
                prev.next = null;
            }

        }

    }

    //MERGE SORT
    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: single element
        }

        int mid = start + (end - start) / 2;

       
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

       
        merge(arr, start, mid, end);
    }

    // Function to merge two sorted halves
    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            left[i] = arr[start + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements (if any)
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL= new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2 !=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
       public Node mergeSort(Node head){
        if(head==null ||  head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);

//        left and right ms
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public Node zigZag(Node head){
        Node res = new Node(-1);
        Node temp = res;

        //find mix
        Node mid= findMid(head);
        Node curr= mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;

        while(right!=null && left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        if (left != null) temp.next = left;
        if (right != null) temp.next = right;
        return res.next;

    }
    
    static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.addFirst(24);
//        ll.addFirst(76);
//        ll.addLast(6);
//
//        ll.addMiddle(4,2);
//
//
//        ll.print();
    //    System.out.println(ll.recursiveSearch(6));
    //    System.out.println(ll.size);
    //    ll.reverseLinkedList();
//        ll.deleteFromNthNode(4);
//        ll.print();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        //cycle detection ( infinite cycle Nodes )
      /*  head=new Node(1);
        Node temp=new Node(2);
        head.next= temp  ;
        head.next.next=new Node(3);
        head.next.next.next=head;

        System.out.println(ll.cycle());
        ll.removeCycle();
        System.out.println(ll.cycle());

        ll.print();

       */
        /*
        LinkedList LL = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();

         */
        LinkedList LL = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
       ll.zigZag(head);
       ll.print();
    }
}
