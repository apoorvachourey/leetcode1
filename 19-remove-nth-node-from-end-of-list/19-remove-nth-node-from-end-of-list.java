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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
     
        ListNode prev = new ListNode(-1);
        ListNode start = prev;
        prev.next = head;
        ListNode first = head;
        while(n!=0){
            first = first==null?null:first.next;
            n--;
        }
        ListNode sec = head;
        while(first!=null){
            first = first.next;
            prev=prev==null?null:prev.next;
            sec = sec==null?null:sec.next;
        }
        
        prev.next = sec.next;
        sec.next = null;
            
         return start.next;   
        
    }
}