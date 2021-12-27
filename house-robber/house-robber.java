class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length+1];
        Arrays.fill(memo,-1);
        return robfrom(0,nums,memo);
    }
    
    public int robfrom(int i, int[] nums, int[] memo){
        if(i>=nums.length){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        
        int ans =  Math.max(robfrom(i+1,nums,memo),robfrom(i+2,nums,memo)+nums[i]);
        memo[i]=ans;
        
        return ans;
        
    }
}