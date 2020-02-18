import java.util.Stack;

public class Leet173 {
    Stack<TreeNode>stack;
    public Leet173(TreeNode root) {
        stack=new Stack<>();
        stack.push(root);
        push(stack,root);

    }
    public void push(Stack<TreeNode>stack,TreeNode root){
        while(root.left!=null){
            root=root.left;
            stack.push(root);
        }
    }


    /** @return the next smallest number */
    public int next() {
        TreeNode node=stack.pop();
        if(node.right!=null){
            push(stack,node.right);
        }
        return node.val;

    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
