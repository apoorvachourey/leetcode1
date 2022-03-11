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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
       
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int count =0;
        while(fast.next!=null){
            fast = fast.next;
            count++;
        }
        
        int rotationPoint = count-k%count;
        
        while(rotationPoint!=0){
            slow=slow.next;
            rotationPoint--;
        }
        
        
        fast.next=dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        
        return dummy.next;
      
        
        
        
    }
}