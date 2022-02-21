class Solution {
    public int majorityElement(int[] nums) {
        int res =0;
        int count =1;
        
       for(int i=0;i<nums.length;i++){
           if(nums[res]==nums[i]){
               count++;
           }else{
               count--;
           }
           if(count==0){
               res=i;
               count=1;
           }
       }
        count=0;
        //verification
        for(int i=0;i<nums.length;i++){
            if(nums[res]==nums[i]){
                count++;
            }
            
            if(count>nums.length/2){
                return nums[res];
            }
        }
        return -1;
    }
}