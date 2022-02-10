class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0; 
        int current =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                current=0;
            }else{
                current++;
                res=Math.max(current,res);
            }
        }
        return res;
    }
}