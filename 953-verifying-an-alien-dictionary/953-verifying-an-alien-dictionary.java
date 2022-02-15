class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        for(int i=0;i<words.length-1;i++){
            String w1 = words[i];
            String w2 = words[i+1];
            
            int j=0;
            int length = Math.min(w1.length(),w2.length());
            for(j=0;j<length;j++){
                int index1 = order.indexOf(w1.charAt(j));
                int index2 = order.indexOf(w2.charAt(j));
                
                if(index1<index2){
                    break;
                }else if(index1>index2){
                    return false;
                }else{
                    continue;
                }
            }
            
            if(j==length && w1.length()>w2.length()){
                return false;
            }
        }
        
        return true;
    }
}
