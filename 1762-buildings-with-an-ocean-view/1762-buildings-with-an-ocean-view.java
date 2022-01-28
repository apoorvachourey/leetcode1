class Solution {
    public int[] findBuildings(int[] heights) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=heights.length-1;i>=0;i--){
            if(heights[i]>max){
                res.add(i);
                max= heights[i];
            }
        }
        int[] result = new int[res.size()];
        int j =0;
        for(int i=res.size()-1;i>=0;i--){
            result[j]=res.get(i);
            j++;
        }
            return result;
        }
    
}
