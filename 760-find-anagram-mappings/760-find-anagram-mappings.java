class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        if(nums1.length!=nums2.length) return res;
        Map<Integer,LinkedList<Integer>> map = new HashMap<>();
        int counter=0;
        for(int i:nums2){
            if(!map.containsKey(i)){
                map.put(i,new LinkedList<>());
            }
            map.get(i).add(counter);
            counter++;
        }
        counter =0; 
        
        for(int i:nums1){
            res[counter++]=map.get(i).pollLast();
        }
        
        return res;
        
    }
}