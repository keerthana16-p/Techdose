class MyStack {
   Queue<Integer> queue1 = new LinkedList<>(); 
   Queue<Integer> queue2 = new LinkedList<>();
    int top;
    public MyStack() {
        
    }
    
    public void push(int x) {
       queue1.add(x);
        top=x;
    }
    
    public int pop() {
       int val;
       while(queue1.size()>1){
           top=queue1.remove();
           queue2.add(top);
       }
        val=queue1.remove();
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;
        return val;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
