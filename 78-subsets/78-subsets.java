class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        allSubsets(0,nums,result,new ArrayList<>());
        return result;
    }
    
    public void allSubsets(int index,int[] nums,List<List<Integer>> result, List<Integer> current){
        if(index>=nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        
        current.add(nums[index]);
        allSubsets(index+1,nums,result,current);
        current.remove(current.size()-1);
        allSubsets(index+1,nums,result,current);
        
    }
}