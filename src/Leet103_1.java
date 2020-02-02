import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leet103_1 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.add(root);

        int level=1;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            if(level%2==1){
                int size=stack1.size();
                List<Integer>list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode node=stack1.pop();
                    if(node.left!=null){
                        stack2.add(node.left);
                    }
                    if(node.right!=null){
                        stack2.add(node.right);
                    }
                    list.add(node.val);
                }
                level++;
                res.add(list);
                continue;
            }
            if(level%2==0){
                int size=stack2.size();
                List<Integer>list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode node=stack2.pop();
                    if(node.right!=null){
                        stack1.add(node.right);
                    }
                    if(node.left!=null){
                        stack1.add(node.left);
                    }
                    list.add(node.val);
                }
                level++;
                res.add(list);
                continue;
            }

        }
        return res;

    }
}
