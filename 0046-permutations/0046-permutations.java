
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(new ArrayList<>(),result,nums);
        return result;
        
    }
    private void backtracking(List<Integer> current, List<List<Integer>> result, int[] nums ){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            backtracking(current, result, nums);
            current.remove(current.size()-1);
        }
    }
}