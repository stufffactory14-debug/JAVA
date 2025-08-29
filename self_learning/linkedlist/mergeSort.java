package linkedlist;


public class mergeSort {


    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return mergeTwoLists(left,right);
    }

    class ListNode{
        int val;
        mergeSort.ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, mergeSort.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1); // dummy node
        ListNode tail = ans; // will be used to build the new list

        ListNode f = list1;
        ListNode s = list2;

        while (f != null && s != null) {
            if (f.val == s.val) {
                tail.next = new ListNode(f.val);
                tail = tail.next;
                tail.next = new ListNode(s.val);
                tail = tail.next;
                f = f.next;
                s = s.next;
            } else if (f.val < s.val) {
                tail.next = new ListNode(f.val);
                tail = tail.next;
                f = f.next;
            } else {
                tail.next = new ListNode(s.val);
                tail = tail.next;
                s = s.next;
            }
        }

        while (f != null) {
            tail.next = new ListNode(f.val);
            tail = tail.next;
            f = f.next;
        }

        while (s != null) {
            tail.next = new ListNode(s.val);
            tail = tail.next;
            s = s.next;
        }

        return ans.next; // skip the dummy node
    }

    ListNode getMid(ListNode head){
        ListNode midPrev=null;
        ListNode slow=head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            midPrev=slow;
            fast=fast.next.next;
            slow=slow.next;

        }
        if(midPrev!=null){
            midPrev.next=null;
        }

        return slow;
    }


}
