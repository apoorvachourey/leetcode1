class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        
        int max1 = robhouse(0,nums.length-2,nums);
        int max2 = robhouse(1,nums.length-1,nums);
        
        return Math.max(max1,max2);
        
    }
    
    public int robhouse(int start,int end, int[] nums){
        int prev_1 = 0 ;
        int prev_2 = 0;
        
        for(int i=start;i<=end;i++){
            int temp = prev_1;
            int current = nums[i];
            prev_1=Math.max(prev_2+current,prev_1);
            prev_2=temp;
        }
        
        return prev_1;
        
    }
}