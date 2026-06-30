class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(0,new ArrayList<>(),res,candidates,target);
        return res;
    }
    private void backtracking(int index, List<Integer> current,List<List<Integer>> res,int [] candidates, int target){
            if(target==0){
                res.add(new ArrayList<>(current));
                return;
            }
            if(index==candidates.length){
                return;
            }
            //pick
            if(candidates[index]<=target){
                current.add(candidates[index]);
                backtracking(index, current, res, candidates, target-candidates[index]);
                current.remove(current.size()-1);
            }
            //no pick
            backtracking(index+1, current, res, candidates, target);
    }
}