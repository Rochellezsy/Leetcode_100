import java.util.Stack;

public class Leet155_1 {
    Stack<Integer>stack;
    Stack<Integer>stackmin;
    public Leet155_1() {
        stack=new Stack<>();
        stackmin=new Stack<>();

    }

    public void push(int x) {
        stack.push(x);
        if(stackmin.isEmpty()){
            stackmin.push(x);
        }
        else if(stackmin.peek()>x){
            stackmin.push(x);
        }
        else if(stackmin.peek()<=x){
            stackmin.push(stackmin.peek());
        }

    }

    public void pop() {
        stack.pop();
        stackmin.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackmin.peek();
    }
}
