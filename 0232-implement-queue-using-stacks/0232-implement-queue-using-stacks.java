class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {

        int s1 = stack1.size();

        for(int i = 0; i < s1; i++){
            stack2.push(stack1.pop());
        }

        stack1.push(x);

        int s2 = stack2.size();

        for(int i = 0; i < s2; i++){
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
        if(stack1.isEmpty()) return -1;

        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */