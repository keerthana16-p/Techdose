class MyQueue { 
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    int front;
    public void push(int x) {
       stack1.push(x);
        front=x;
    }
    
    public int pop() {
        int val;
        while(stack1.size()>1){
            front=stack1.pop();
            stack2.push(front);
        }
        val=stack1.pop();
        while(!stack2.empty()){
            front=stack2.pop();
            stack1.push(front);
        }
        return val;
    }
    
    public int peek() {
       int val;
        while(stack1.size()>0){
            front=stack1.pop();
            stack2.push(front);
        }
        val=stack2.peek();
        while(!stack2.empty()){
            front=stack2.pop();
            stack1.push(front);
        }
        return val;
    }
    
    public boolean empty() {
        return stack1.empty();
    }
}
