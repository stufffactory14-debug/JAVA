/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int l1=0;
       int l2=0;
       ListNode temp1=headA;
       ListNode temp2=headB;
          ListNode temp3=headA;
       ListNode temp4=headB;
       while(temp1!=null){
        l1++;
        temp1=temp1.next;
       }
       while(temp2!=null){
        l2++;
        temp2=temp2.next;
       }
       int dif=Math.abs(l2-l1);
    if(l2>l1){
        while(dif!=0){
            temp4=temp4.next;
            dif--;
        }
    }else{
        while(dif!=0){
            temp3=temp3.next;
            dif--;
        }

    }
    while(temp3!=null){
        if(temp3==temp4){
            return temp3;
        }
        temp3=temp3.next;
        temp4=temp4.next;
    }
return null;
    }
}
