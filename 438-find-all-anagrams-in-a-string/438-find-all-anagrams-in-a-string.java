class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        
        //put pattern count in map
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        //a-1,b-1,c-1
        int count = map.size();
        //work on the window
        int i=0;int j=0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    count--;
                }
            }
            
            if(j-i+1==p.length()){
                if(count==0){
                    res.add(i);
                }
           
                
                if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i))==1)
                        count++;
                    
                }
                i++;
            }
            j++;
        }
        
        return res;
        
    }
}