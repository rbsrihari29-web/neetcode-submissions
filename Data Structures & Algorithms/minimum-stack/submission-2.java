class MinStack {
    Stack<Integer> st;
    Stack<Integer> ms;
    public MinStack() {
        st=new Stack<>();
        ms=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(ms.isEmpty()||val<=ms.peek()){
            ms.push(val);
        }
    }
    
    public void pop() {
        if(ms.peek().equals(st.peek())){
            ms.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}
