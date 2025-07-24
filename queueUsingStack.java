class MyQueue {
    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    public MyQueue() {

        
    }
    
    public void push(int x) {
        stk1.push(x);
    }
    
    public int pop() {
        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
                
            }
            
        }
        
        return stk2.pop();
        
    }
    
    public int peek() {

        if(stk2.isEmpty()){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
                
            }
        }
        return stk2.peek();
        
    }
    
    public boolean empty() {
        
        return stk1.isEmpty() && stk2.isEmpty();
        
        
    }
}