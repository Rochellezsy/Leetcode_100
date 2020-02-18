import java.util.ArrayList;
import java.util.List;

public class Leet257 {
    List<String>list=new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)return list;
        digui(root,"");
        return list;
    }

    public void digui(TreeNode root,String s){
        if(root==null)return;
        if(root.left==null && root.right==null){
            s+=root.val;
            list.add(s);
        }
        digui(root.left,s+root.val+"->");
        digui(root.right,s+root.val+"->");
    }
}
