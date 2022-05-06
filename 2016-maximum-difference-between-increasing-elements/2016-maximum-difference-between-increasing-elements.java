class Solution {
    public int maximumDifference(int[] nums) {
       int min = nums[0];
        int res =-1;
       for(int j=1;j<nums.length;j++){
           res = Math.max(res, nums[j]-min);
           min = Math.min(min,nums[j]);
       } 
        
        return res == 0 ? -1 : res;
    }
}

/*
 //naive approach 
        int res = -1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
                res = Math.max(res,nums[j]-nums[i]);
            }
        }
        return res;
*/