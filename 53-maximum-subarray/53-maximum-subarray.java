class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = nums[0];
        for(int i=0;i<nums.length;i++){
            sum= sum+nums[i];
            maxsum= Math.max(sum,maxsum);
            if(sum<0) sum =0;
        }
        
        return maxsum;
    }
}

/*
 int currentsum = nums[0];
        int maxsum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum = Math.max(nums[i], currentsum+nums[i]);
            maxsum = Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
*/