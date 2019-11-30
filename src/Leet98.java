import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leet98 {
    TreeNode pre=null;

    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left))return false;
        if(pre!=null&& pre.val>=root.val)return false;
        pre=root;
        return isValidBST(root.right);
    }

}
