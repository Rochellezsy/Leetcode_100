public class Leet98_3 {
    TreeNode pre=null;
    public boolean isvaild(TreeNode root){
        if(root==null) return true;

        if(!isvaild(root.left)) return false;
        if(pre!=null && pre.val>=root.val){
            return false;
        }
        pre=root;
        return isvaild(root.right);

    }
}
