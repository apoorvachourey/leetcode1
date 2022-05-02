class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,count,i);
                count++;
            }
        }
    }
    
    public void swap(int [] nums, int count, int i){
        int temp = nums[i];
        nums[i] = nums[count];
        nums[count] = temp;
    }
}