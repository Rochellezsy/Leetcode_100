import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet103_3 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        Stack<TreeNode>stack1=new Stack<>();
        Stack<TreeNode>stack2=new Stack<>();
        int level=1;
        stack1.add(root);
        while(!stack1.isEmpty() ||!stack2.isEmpty()){
            if(level%2==1){
                int size=stack1.size();
                List<Integer>list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode node=stack1.pop();
                    list.add(node.val);
                    if(node.left!=null){
                        stack2.add(node.left);
                    }
                    if(node.right!=null){
                        stack2.add(node.right);
                    }
                }
                level++;
                res.add(list);
                continue;
            }
            else if(level%2==0){
                int size=stack2.size();
                List<Integer>list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode node=stack2.pop();
                    list.add(node.val);
                    if(node.right!=null){
                        stack1.add(node.right);
                    }
                    if(node.left!=null){
                        stack1.add(node.left);
                    }
                }
                res.add(list);
                level++;
                continue;
            }
        }
        return res;

    }
}
