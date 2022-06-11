class Solution {
    public int minOperations(int[] nums, int x) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        sum = sum-x;
        
        if(sum==0) return nums.length;
        if(sum<0) return -1;
        
        int i=0;
        int j=0;
        int current =0;
        int maxlen =Integer.MIN_VALUE;
        
        while(j<nums.length){
            
          current+=nums[j];
          
          while(i<nums.length && current>sum){
              current-=nums[i];
              i++;
          }  
          if(current==sum){
              maxlen = Math.max(maxlen,j-i+1);
          }  
            j++;
    
        }
        
        return (maxlen == Integer.MIN_VALUE? -1 : nums.length-maxlen);
    }
}