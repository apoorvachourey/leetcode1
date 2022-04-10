class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String s : ops){
            if(s.equals("+")){
                if(!stack.isEmpty()){
                int top = stack.pop();
                int score = top + stack.peek();
                stack.push(top);
                stack.push(score);
                sum+=stack.peek();
                }
            }else if(s.equals("D")){
                if(!stack.isEmpty()){
                int score = 2*stack.peek();
                stack.push(score);   
                sum+=stack.peek();
                }
            }else if(s.equals("C")){
                if(!stack.isEmpty()){
                    sum-=stack.pop();
                    
                }
            }else{
                int score = Integer.parseInt(s);
                stack.push(score);
                sum += stack.peek();
            }
        }
        return sum;
    }
}