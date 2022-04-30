class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                third = sec;
                sec = first;
                first = nums[i];
            }else if(nums[i]>sec && nums[i]!=first){
                third = sec;
                sec = nums[i];
            }else if(nums[i]>third && nums[i]!=sec && nums[i]!=first){
                third = nums[i];
            }
        }
        
         if(third==Long.MIN_VALUE){
             return (int)first;
         }else return (int)third;
        
        
        
    }
}