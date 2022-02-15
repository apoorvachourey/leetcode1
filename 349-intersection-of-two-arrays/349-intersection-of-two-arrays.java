class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }
        Set<Integer> intersect = new HashSet<>();
        
        for(int i: nums2){
            if(set.contains(i)){
                intersect.add(i);
            }
        }
        
        int res[] = new int[intersect.size()];
        int i=0;
        for(Integer num : intersect){
            res[i++]=num;
        }
        return res;
    }
}