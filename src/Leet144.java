import java.util.ArrayList;
import java.util.List;

public class Leet144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        digui(root,list);
        return list;

    }

    public void digui(TreeNode root,List<Integer>list){
        if(root!=null){
            list.add(root.val);
            digui(root.left,list);
            digui(root.right,list);
        }
    }
}
