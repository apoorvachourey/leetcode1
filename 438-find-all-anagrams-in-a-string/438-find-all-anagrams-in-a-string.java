class Solution {
    static final int CHAR = 256; 
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length()) return res;
        int [] countS = new int[CHAR];
        int [] countP = new int[CHAR];
        
        for(int i=0;i<p.length();i++){
            countS[s.charAt(i)]++;
            countP[p.charAt(i)]++;
        }
         if(areSame(countS,countP)){
                res.add(0);
           }
        
        for(int i=p.length();i<s.length();i++){
              
            countS[s.charAt(i)]++;
            countS[s.charAt(i-p.length())]--;
              if(areSame(countS,countP)){
                res.add(i-p.length()+1);
            }
        }
        
        return res;
        
    }
    
    public boolean areSame(int[] countS, int[] countP){
        for(int i=0;i<CHAR;i++){
            if(countS[i]!=countP[i]){
                return false;
            }
        }
        return true;
    }
}