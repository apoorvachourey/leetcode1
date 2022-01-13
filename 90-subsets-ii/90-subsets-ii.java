class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
         Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        helper(0, nums, result, new ArrayList<>(),set);
         List<List<Integer>> newAns = new ArrayList<List<Integer>>();
        for(List<Integer> curr : result){
            set.add(curr);
        }
        for(List<Integer> curr : set){
            newAns.add(curr);
        }
        return newAns;
    }
    
    public void helper(int index, int[] nums, List<List<Integer>> result, List<Integer> current,HashSet<List<Integer>> set ){
        if(index>=nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        
        current.add(nums[index]);
        helper(index+1,nums,result,current,set);
        current.remove(current.size()-1);
        helper(index+1,nums,result,current,set);
        
    }
}