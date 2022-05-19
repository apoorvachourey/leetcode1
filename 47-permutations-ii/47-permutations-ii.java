class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
             List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        findPermutation(nums,result,map,new ArrayList<>());
        return result;
    }
    
    public void findPermutation(int[] nums,  List<List<Integer>> result, Map<Integer,Integer> map,List<Integer> current){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
        
            if(map.containsKey(i)) continue; 
            if(i>0 && nums[i]==nums[i-1] && !map.containsKey(i-1)) continue;
            map.put(i,1);
            current.add(nums[i]);
            findPermutation(nums,result,map,current);
            map.remove(i);
            current.remove(current.size()-1);
        
        }
    }
}