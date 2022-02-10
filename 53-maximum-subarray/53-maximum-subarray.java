class Solution {
    public int maxSubArray(int[] nums) {
        /*
        maxati = max(maxat(i-1)+nums[i],nums[i]);
        */
        
        int current = nums[0];
        int max = current;
        
        for(int i=1;i<nums.length;i++){
            current  = Math.max(current+nums[i], nums[i]);
            max= Math.max(max,current);
        }
        return max;
    }
}