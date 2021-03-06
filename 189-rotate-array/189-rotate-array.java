class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int [] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}

// 1,2,3,4,5,6,7
//-> 7,6,5,4,3,2,1
//=> 5,6,7,4,3,2,1
//-> 5,6,7,1,2,3,4