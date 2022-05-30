class Solution {
    public int[] diStringMatch(String s) {
        int smallest =0;
        int largest = s.length();
        int[] res = new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                res[i] = smallest;
                smallest++;
            }else if(s.charAt(i)=='D'){
                res[i]=largest;
                largest--;
            }
        }
        res[s.length()]=largest;
        return res;
    }
}