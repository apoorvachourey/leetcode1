class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int j:nums2){
            if(map.containsKey(j) && map.get(j)>0){
                res.add(j);
                map.put(j,map.get(j)-1);
            }
        }
        int result[] = new int [res.size()];
        int i=0;
        for(int num : res){
            result[i++]=num;
        }
        
        return result;
    }
}