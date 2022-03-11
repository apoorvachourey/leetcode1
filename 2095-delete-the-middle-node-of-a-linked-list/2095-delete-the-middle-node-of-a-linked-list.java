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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode current = head;
        
        int countNodes = 0; 
        while(current!=null){
            countNodes++;
            current=current.next;
        }
        
        current = head;
        int midNode = countNodes/2;
        while(midNode!=0){
            prev=prev==null?null:prev.next;
            current=current==null?null:current.next;
            midNode--;
        }
        
        prev.next=current.next;
        current.next = null;
        
        return head;
        
    }
}