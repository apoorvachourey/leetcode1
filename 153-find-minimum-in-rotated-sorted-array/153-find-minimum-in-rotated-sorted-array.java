class Solution {
    public int findMin(int[] nums) {
        int low = 0; 
        int high = nums.length-1;
        
        while(low<high){
            int mid = low+(high-low)/2;
            if(mid>=0 && nums[mid]>nums[mid+1]){
               return nums[mid+1];
            }
            if(nums[mid]>=nums[low] && nums[mid]>nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        
        return nums[low];
    }
}