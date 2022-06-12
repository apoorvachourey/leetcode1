class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int j=0;
        int sum =0; 
        int maxsum =0;
        Set<Integer> set = new HashSet<>();
        
        while(j<nums.length){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum+=nums[j];
                maxsum = Math.max(maxsum,sum);
                j++;
            }else{
                sum=sum-nums[i];
                set.remove(nums[i]);
                i++;
            }
            
        }
        return maxsum;
    }
}