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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        
        while(current!=null){
            map.put(current.val,map.getOrDefault(current.val,0)+1);
            current=current.next;
        }
        
        current=dummy.next;
        
        while(current!=null){
            if(map.get(current.val)>1){
                prev.next = current.next;
                current.next = null;
                current = prev.next;
            }else{
                prev=prev.next;
                current=current.next;
            }
        }
        return dummy.next;
        
    }
}