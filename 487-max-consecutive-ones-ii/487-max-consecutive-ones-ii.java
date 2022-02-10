class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int right =0;
        int numberOfZero = 0;
        int result = 0;
        while(right<nums.length){
            
            if(nums[right]==0){
                numberOfZero++;
            }
            
            while(numberOfZero==2){
                if(nums[left]==0){
                    numberOfZero--;
                }
                left++;
            }
            
            result = Math.max(result,right-left+1);
            right++;
            
        }
        return result;
    }
}