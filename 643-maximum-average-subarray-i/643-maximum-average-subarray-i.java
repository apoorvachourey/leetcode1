class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double avg = 0;
        
        int i=0;int j=0; 
        double sum = 0;
        
        
        while(j<nums.length){
            sum =sum+nums[j];
            if(j-i+1 <k){
                j++;
            }else if(j-i+1 ==k ){
                avg = sum/k;
                maxAvg = Math.max(maxAvg,avg);
                
                sum = sum-nums[i];
                i++;
                j++;
            }
        }
        return maxAvg;
    }
}