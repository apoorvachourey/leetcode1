class Solution {
    public int numberOfSteps(int num) {
        
        int temp = num;
        int count=0;
        while(temp!=0){
            if(temp%2==0){
                temp=temp/2;
            }else{
                temp = temp-1;
            }
            count++;
        }
        return count;
    }
}