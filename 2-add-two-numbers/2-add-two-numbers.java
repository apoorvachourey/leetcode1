/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(-1);
        int carry = 0;
        ListNode current = resultHead;
        
        while(l1!=null || l2!=null){
            
            int val1 = l1==null?0:l1.val;
            int val2 = l2==null?0:l2.val;
            
            int sum = (carry+val1+val2);
            carry = sum/10;
            
            current.next = new ListNode(sum%10);
            current=current.next;
            
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            
        }
        if(carry!=0) current.next = new ListNode(carry);
        return resultHead.next;
      
    }
}