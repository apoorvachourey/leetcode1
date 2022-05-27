class Solution {
    public int[] twoSum(int[] nums, int target) {
       // List numsList = Arrays.asList(nums);
        int [] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        //[2,7,11,15], target = 9
        //map => {2,0}{7,1},{}
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                res[0] = map.get(complement);
                res[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}