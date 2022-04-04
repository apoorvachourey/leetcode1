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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode slow = head;
        ListNode fast = head;
        int lastK = k;
        while (lastK!=0){
            fast = fast.next;
            lastK--;
        }
        
        while(fast!=null){
            slow = slow.next;
            fast= fast.next;
        }
        
        ListNode firstNode = head;
        while(k-1!=0){
            firstNode = firstNode.next;
            k--;
        }
        
        ListNode secondNode = slow;
        
        // swap 
        
        int temp = firstNode.val;
        firstNode.val= secondNode.val;
        secondNode.val = temp;
        
        return head;
        
    }
}