class Solution {
    public int findPairs(int[] nums, int k) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x: map.keySet()){
            if((k>0 && map.containsKey(x+k)) || (k==0 && map.get(x)>1)){
                count++;
            }
        }
        return count;
    }

}

