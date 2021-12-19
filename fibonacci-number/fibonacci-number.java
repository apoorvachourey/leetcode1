class Solution {
    public int fib(int n) {
        int [] memo =  new int [n+1];
        for(int i = 0; i<n+1 ; i++){
            memo[i]=-1;
        }
        
        return helper(n,memo);
    }
    
    public int helper(int n, int[] memo){
        int res = 0;
        if(memo[n]==-1){
            if(n==0 || n==1){
                res = n;
            }
            else{
                res = helper(n-1,memo)+helper(n-2,memo);
            }
            memo[n]=res;
        }
        res = memo[n];
        return res;
    }
}