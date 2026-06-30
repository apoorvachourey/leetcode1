class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(new ArrayList<>(),res,nums);
        return res;
        
    }
    private void backtracking(List<Integer> current,List<List<Integer>> res, int[] nums ){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            backtracking(current, res, nums);
            current.remove(current.size()-1);
        }
    }
}