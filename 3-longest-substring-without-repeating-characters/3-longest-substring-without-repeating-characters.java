class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result =0;
        int prev[] = new int[256];
        Arrays.fill(prev,-1);
        int i=0;
        for(int j=0;j<s.length();j++){
            i=Math.max(i,prev[s.charAt(j)]+1);
            int maxEnd = j-i+1;
            result = Math.max(result,maxEnd);
            prev[s.charAt(j)] = j;
        }
        
        return result;
    }
}