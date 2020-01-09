import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet102_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        if(root==null)return new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                list.add(node.val);
            }
            res.add(list);
        }
        return res;

    }
}
