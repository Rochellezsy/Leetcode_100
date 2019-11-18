import java.util.Stack;
import java.lang.String;

public class Leet20 {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        if(s.length()%2!=0){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty()&&s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(!stack.isEmpty()&&s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
            }
            else if(!stack.isEmpty()&&s.charAt(i)=='}' && stack.peek()=='{'){
                stack.pop();
            }

        }



        return stack.isEmpty();

    }
}
