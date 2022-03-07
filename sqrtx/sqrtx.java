class Solution {
    public int mySqrt(int x) {
        int low =1; 
        int high =x/2;
        long num =0;
        if(x<2) return x;
        while(low<=high){
            int mid = low+(high-low)/2;
            num=(long)mid*mid;
           if(num <x){
                low = mid+1;
            }else if(num>x){
                high = mid-1;
            }else return mid;
        }
        return high;
        
    }
}