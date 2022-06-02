class Solution {
    public int[] runningSum(int[] nums) {
        
        int [] res = new int[nums.length];
       // if(nums.length==0 || nums==null) return 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            res[i]=sum;
        }
        return res;
    }
}