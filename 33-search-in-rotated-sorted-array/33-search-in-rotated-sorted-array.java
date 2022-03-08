class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            return nums[0]==target?0:-1;
        }
        int pivot = findPivot(nums);

        if(pivot==-1){
            
            return binarySearch(nums,0,nums.length-1,target);
        }else{
            if(nums[pivot]==target)return pivot;
            if(target<nums[0]){
                return binarySearch(nums,pivot+1,nums.length-1,target);
            }else if(target>=nums[0]){
                return binarySearch(nums,0,pivot,target);
            }
        }
        return -1;
    }
    
    public int findPivot(int[] nums){
        int low = 0;
        int high = nums.length-1;
        
        if (nums[low] < nums[high])
        return -1;
        
        while(low<=high && low<nums.length){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }else
                if(nums[mid]>nums[low]){
                    low = mid;
                }else {
                    high = mid;
                }
            }
        return -1;
    }
    
    public int binarySearch(int nums[], int low, int high, int target){
        while(low<=high && low<nums.length){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high =mid-1;
            }
            
        }
        return -1;
    }
    
}