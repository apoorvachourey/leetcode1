class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int right=0;
        int result=0;
        int numOfZeros =0;
        
        while(right<nums.length){
            if(nums[right]==0){
                numOfZeros++;
            }
            while(numOfZeros==k+1){
                if(nums[left]==0){
                    numOfZeros--;
                }
                left++;
            }
            
            result =Math.max(result,right-left+1);
            right++;
        }
        return result;
        
    }
}