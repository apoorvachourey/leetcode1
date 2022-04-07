class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>((a,b)->(b-a));
        for(int x : stones){
            pqueue.add(x);
        }
        
        while(pqueue.size()>1){
            pqueue.add(pqueue.poll()-pqueue.poll());
        }
        
        return pqueue.poll();
        
    }
}