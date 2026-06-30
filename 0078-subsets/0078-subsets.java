class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(0,new ArrayList<>(),result,nums);
        return result;
    }

    private void backtracking(int index,List<Integer> current,List<List<Integer>> result, int[] nums){
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtracking(index+1, current, result, nums);
        current.remove(current.size()-1);
        backtracking(index+1, current, result, nums);
    }
}