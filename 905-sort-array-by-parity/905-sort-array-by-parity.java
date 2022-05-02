class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int countOfEven = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]%2==0){
                swap(nums,countOfEven,i);
                countOfEven++;
            }
        }
        
        return nums;
    }
    
    public void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}