class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.add(num);
        }
        
        int a = pq.poll();
        int b = pq.poll();
        return (a-1)*(b-1);
    }
}