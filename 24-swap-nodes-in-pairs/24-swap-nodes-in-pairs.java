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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while((head!=null) && (head.next!=null)){
            //to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            
            //swap 
            prev.next = secondNode;
            firstNode.next=secondNode.next;
            secondNode.next = firstNode;
            
            //reinitialize pre and head
            prev = firstNode;
            head = firstNode.next;
        }
        
        return dummy.next;
        
    }
}