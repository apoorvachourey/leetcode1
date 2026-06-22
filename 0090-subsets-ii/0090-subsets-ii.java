class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtracking(0,current,res,nums);
        return res;
    }
    private void backtracking(int index, List<Integer> current, List<List<Integer>> res,int[] nums){
        if(index==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtracking(index+1, current, res, nums);
        current.remove(current.size()-1);
        while((index+1)<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        backtracking(index+1, current, res, nums);
    }
}