class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ll = new ListNode(0);
        ListNode curr=ll;
        ListNode i=l1,j=l2;
        int carry=0;
        while(i!=null || j!=null){
            int a1=(i!=null)?i.val:0;
            int b1=(j!=null)?j.val:0;

            int sum=a1+b1+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10;
            if(i!=null) i=i.next;
            if(j!=null) j=j.next;
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return ll.next;
    }
}
