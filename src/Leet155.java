import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


public class Leet155 {
    /** initialize your data structure here. */
    Stack<Integer> stackfu;
    Stack<Integer> stackmin;

    public Leet155() {
        stackmin=new Stack<>();
        stackfu=new Stack<>();
    }

    public void push(int x) {
        stackmin.push(x);
        if(stackfu.isEmpty()){
            stackfu.push(x);
        }
        else {
            if(stackfu.peek()<x){
                stackfu.push(stackfu.peek());
            }
            else if(stackfu.peek()>=x){
                stackfu.push(x);
            }
        }
    }

    public void pop() {
        stackfu.pop();
        stackmin.pop();
    }

    public int top() {
        return stackmin.peek();

    }

    public int getMin() {
        return stackfu.peek();
    }
}
