class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        // there could be only 2 me
        
        Integer res1 = null;
        Integer res2 =null;
        
        int count1 =0;
        int count2 =0;
        
        for(int n: nums){
            if(res1!=null && res1== n){
                count1++;
            }else if(res2!=null && res2== n){
                count2++;
            }else if(count1==0){
                res1=n;
                count1++;
            }else if (count2==0){
                res2=n;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        
        for(int n : nums){
            if(res1!=null && res1==n){
                count1++;
            }
            if(res2!=null &&res2==n){
                count2++;
            }
        }
        
        if(count1>nums.length/3){
            result.add(res1);
        }
        if(count2>nums.length/3){
            result.add(res2);
        }
        
        return result;
        
    }
    
  
}