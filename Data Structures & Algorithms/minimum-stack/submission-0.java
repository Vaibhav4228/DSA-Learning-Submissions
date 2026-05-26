class MinStack {

    Deque<Integer> st;
    Deque<Integer>minStack;

    public MinStack() {
        st = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() ||  val <= minStack.peek()){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        int removed = st.pop();
        if(removed == minStack.peek()) minStack.pop();
        
    }
    
    public int top() {
         int top = st.peek();
         return top;
    }
    
    public int getMin() {
        int mini = minStack.peek();
        return mini;

        
    }
}
