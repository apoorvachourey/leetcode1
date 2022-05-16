class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0 || nums==null) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)) return true;
            else map.put(num,1);
        }
        return false;
    }
}