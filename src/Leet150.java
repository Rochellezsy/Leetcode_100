import java.util.Stack;

public class Leet150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        Integer a;
        Integer b;
        for (String token : tokens) {
            switch (token){
                case "+":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(a+b);
                    break;
                case "-":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(b-a);
                    break;
                case "*":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(a*b);
                    break;
                case "/":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(b/a);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
                    break;
            }
        }

        return stack.pop();

    }
}
