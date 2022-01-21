class MinStack {
    Stack<Long> st = new Stack<Long>();
    Long min;
    public MinStack() {
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long value = Long.valueOf(val);
        if(st.isEmpty()){ 
            min = value;
            st.push(value);
        }else{
            if(value < min){   //if the current input value is smaller than min, then push a modified value of into stack
                st.push(2*value-min);
                min = value;
            }else{
                st.push(value);
            }
        }
        
    }
    
    public void pop() {
        if(st.isEmpty())return;
        
        Long val = st.pop();
        if(val < min){
            min = 2*min - val;
        }
    }
    
    public int top() {
        Long val = st.peek();
        if(val < min){ //so you have a modified value in stack
            return min.intValue();
        }
        return val.intValue();
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */