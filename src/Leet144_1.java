import java.util.*;

public class Leet144_1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)return new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        List<Integer>list=new ArrayList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }
        }
        return list;

    }
}
