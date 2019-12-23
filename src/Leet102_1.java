import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet102_1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        return BFS(root);
    }

    public List<List<Integer>> BFS(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
            res.add(list);
        }
        return res;

    }



}
