class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int happyChild = 0;
        
        //[10,9,8,7]
        //[5,6,7,8]
// 7,8,9,10
//5,6,7,8
        int i=0;
        for(int j=0; i<g.length && j<s.length;j++){
            if(g[i]<=s[j]){
               //happyChild++;
                i++;
            }
        }
        return i;
    }
}