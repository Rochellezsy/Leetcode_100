import java.util.*;

public class Leet103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        return ZBFS(root);
    }

    public List<List<Integer>> ZBFS(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        int level=1;
        Stack<TreeNode> stack1=new Stack<>();//存放奇数
        Stack<TreeNode> stack2=new Stack<>();//存放偶数
        stack1.push(root);


        while(!stack1.isEmpty()||!stack2.isEmpty()){
            if(level%2!=0){
                List<Integer> list=new ArrayList<>();
                int size=stack1.size();
                for(int i=0;i<size;i++){
                    TreeNode node=stack1.pop();
                    if(node.left!=null){
                        stack2.push(node.left);
                    }
                    if(node.right!=null){
                        stack2.push(node.right);
                    }
                    list.add(node.val);
                }
                res.add(list);
                level++;
                continue;
            }
            if(level%2==0){
                List<Integer> list=new ArrayList<>();
                int size=stack2.size();
                for(int i=0;i<size;i++){
                    TreeNode node=stack2.pop();
                    if(node.right!=null){
                        stack1.push(node.right);
                    }
                    if(node.left!=null){
                        stack1.push(node.left);
                    }
                    list.add(node.val);
                }
                res.add(list);
                level++;
                continue;
            }
        }

        return res;

    }

}
