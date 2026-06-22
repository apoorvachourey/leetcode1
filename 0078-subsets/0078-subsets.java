class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        backtracking(0,nums,current,res);
        return res;
        
    }
    private void backtracking(int index,int[] nums,List<Integer> current, List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(current));
            return;

        }
        current.add(nums[index]);
        backtracking(index+1, nums, current, res);
        current.remove(current.size()-1);
        backtracking(index + 1, nums, current, res);
    }
}