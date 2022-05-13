class Solution {
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinationSum(k,n,1,result,new ArrayList<>());
        return result;
    }
    
    public void findCombinationSum(int k, int sum,int start,List<List<Integer>> result , List<Integer> current){
        if(current.size()>k || sum<0){
            return;
        }
        if(current.size()==k && sum==0){
            result.add(new ArrayList<>(current));
            return ;
        }
        
        for(int i=start; i<=9;i++){
            current.add(i);
            findCombinationSum(k,sum-i,i+1,result,current);
            current.remove(current.size()-1);
        }
    }
}