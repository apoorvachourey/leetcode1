class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int sum =0; 
        int current =0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]-nums[i-2]==nums[i]-nums[i-1]){
                current++;
                sum+=current;
            }else{
                current =0;
            }
        }
        
        return sum;
    }
}