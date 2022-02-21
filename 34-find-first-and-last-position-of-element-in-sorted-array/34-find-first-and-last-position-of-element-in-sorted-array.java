class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        int s = search(nums,target);
        if(s==-1) return new int[]{-1,-1};
        res[0] = binarySearch(nums, target);
        res[1] = binarySearchHigh(nums, target);
        return res;
    }
    
     public int search(int[] nums,int target){
        int low =0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high = mid-1;
            else if(nums[mid]==target) return mid;
            
        }
        
        return -1;
    }
    
     public int binarySearch(int[] nums,int target){
        int low =0;
        int high = nums.length-1;
        
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>=target) high = mid;
        }
        System.out.print(low);
        return low;
    }
    
    public int binarySearchHigh(int[] nums,int target){
        int low =0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>target) high = mid-1;
            else if(nums[mid]<=target) low=mid+1;
             
        }
        System.out.print(low);
        return low-1;
    }
}