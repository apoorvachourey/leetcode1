class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums2[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        int res[] = new int[nums1.length];
        for(int i=nums1.length-1;i>=0;i--){
            if(map.containsKey(nums1[i])){
                res[i]=map.get(nums1[i]);
            }
        }
        return res;
    }
}