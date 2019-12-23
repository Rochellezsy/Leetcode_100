import java.util.ArrayList;
import java.util.List;

public class Leet102_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        digui(root,res,1);
        return res;
    }

    public void digui(TreeNode node,List<List<Integer>> res,int level){
        if(res.size()<level){
            res.add(new ArrayList<>());
        }
        res.get(level-1).add(node.val);

        if(node.left!=null){
            digui(node.left,res,level+1);
        }
        if(node.right!=null){
            digui(node.right,res,level+1);
        }

    }

}
