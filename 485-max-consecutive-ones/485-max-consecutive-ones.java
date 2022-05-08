class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res =0; int current =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                current =0;
                
            }else{
                current++;
                res = Math.max(res,current);
            }
        }
        
        return res;
    }
}