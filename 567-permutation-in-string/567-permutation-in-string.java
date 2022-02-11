class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []counts1 = new int[26];
        int []counts2 = new int[26];
        
        if(s2.length()<s1.length()) return false;
        
        for(int i=0;i<s1.length();i++){
            counts1[s1.charAt(i)-'a']++;
            counts2[s2.charAt(i)-'a']++;
        }
        
        for(int i=s1.length();i<s2.length();i++){
            if(areSame(counts1,counts2)){ return true;
                                        }
            counts2[s2.charAt(i)-'a']++;
            counts2[s2.charAt(i-s1.length())-'a']--;
            
        }
        
        return areSame(counts1,counts2);
    }
    public boolean areSame(int[] countS, int[] countP){
        for(int i=0;i<26;i++){
            if(countS[i]!=countP[i]){
                return false;
            }
        }
        return true;
    }
}