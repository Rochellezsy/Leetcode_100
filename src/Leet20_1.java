import java.util.Stack;

public class Leet20_1 {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        if(s.length()==0)return true;
        if(s.length()%2!=0)return false;
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() &&s.charAt(i)==')'&&stack.peek()=='('){
                stack.pop();
            }
            else if(!stack.isEmpty() &&s.charAt(i)==']'&&stack.peek()=='['){
                stack.pop();
            }
            else if(!stack.isEmpty() &&s.charAt(i)=='}'&&stack.peek()=='{'){
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();

    }
}
