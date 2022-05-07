class MyStack {

  //using two queue. The pop and top are inefficient.
private Queue<Integer> q1 = new LinkedList<Integer>();
private Queue<Integer> q2 = new LinkedList<Integer>();
public void push(int x) {
    if(!q1.isEmpty()) 
        q1.add(x);
    else
        q2.add(x);
}
public int pop() {
    if(q1.isEmpty()) {
        int size = q2.size();
        for(int i = 1; i < size; i ++) {
            q1.add(q2.poll());
        }
       return  q2.poll();
    }else {
        int size = q1.size();
        for(int i = 1; i < size; i ++) {
            q2.add(q1.poll());
        }
       return  q1.poll();
    }
}
public int top() {
    int res;
    if(q1.isEmpty()) {
        int size = q2.size();
        for(int i = 1; i < size; i ++) {
            q1.add(q2.poll());
        }
        res = q2.poll();
        q1.add(res);
    }else {
        int size = q1.size();
        for(int i = 1; i < size; i ++) {
            q2.add(q1.poll());
        }
        res = q1.poll();
        q2.add(res);
    }
    return res;
}
public boolean empty() {
    return q1.isEmpty() && q2.isEmpty();
}
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */