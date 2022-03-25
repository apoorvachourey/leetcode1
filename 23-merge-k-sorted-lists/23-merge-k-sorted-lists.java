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
    public ListNode mergeKLists(ListNode[] lists) {
         if (lists==null||lists.length==0) return null;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>(){
            
            public int compare(ListNode l1, ListNode l2){
                if(l1.val<l2.val){
                    return -1;
                }else if(l1.val>l2.val){
                    return 1;
                }else return 0;
            }
        });
        
        ListNode resultHead = new ListNode(-1);
       ListNode current =resultHead; 
        
        for(ListNode node : lists){
            if(node!=null){
            queue.add(node);
            }
        }
        
        
        while(!queue.isEmpty()){
            current.next = queue.poll();
            current = current.next;
            
            if(current.next!=null){
                queue.add(current.next);
            }
        }
        
        return resultHead.next;
        
        
    }
}