import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet230 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>list=new ArrayList<>();
        digui(list,root);
        Collections.sort(list);
        return list.get(k-1);

    }
    public void digui(List<Integer> list, TreeNode root){
        if(root!=null){
            list.add(root.val);
            digui(list,root.left);
            digui(list,root.right);
        }
    }
}
