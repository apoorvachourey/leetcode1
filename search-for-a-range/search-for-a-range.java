class Solution {
    public int[] searchRange(int[] nums, int target) { 
        if(nums==null || nums.length==0) return new int[]{-1,-1};
        int res [] = new int[2];
        res[0]=findTheFirstOccurance(nums, target);
        res[1]=findTheLastOccurance(nums,target);
        return res;
    }
    
    public int findTheFirstOccurance(int nums[],int target){
        int low = 0;
        int high = nums.length-1;
        
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=target){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        if(nums[low]==target) return low;
        return -1;
    }
    
     public int findTheLastOccurance(int nums[],int target){
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<=target){
                low = mid+1;
            }else{
                high = mid-1;
            }
            if(nums[mid]==target) index = mid;
        }
        
         return index;
    }
    
    
}