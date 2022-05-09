class Solution {
     static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<String>();
        }
        List<String> res = recursionHelper(digits);
        return res;
    }
    
    public List<String> recursionHelper(String digits) {
        if(digits.length()==0){
            return new ArrayList<String>(){{
                add("");
            }};
        }
        
        char ch = digits.charAt(0);
        String restOfTheString = digits.substring(1);
       List<String> listOfSubseq =  recursionHelper(restOfTheString);
        List<String> totalSubs = new ArrayList<String>();
        String codeForCh = codes[ch-'0'];
        for(int i =0;i<codeForCh.length();i++){
            char codeChar = codeForCh.charAt(i);
            for(String s : listOfSubseq){
                totalSubs.add(codeChar+s);
            }
        }
        
        return totalSubs;
        
    }
}