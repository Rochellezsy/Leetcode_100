public class Leet110_2 {
    boolean flag=true;

    public boolean isBalanced(TreeNode root){
        depth(root);
        return flag;
    }
    public int depth(TreeNode root){
        int count=0;
        if (root!=null){
           int left=depth(root.left);
           int right=depth(root.right);
           if(Math.abs(left-right)>1){
               flag=false;
           }
           count=Math.max(left,right)+1;
        }
        return count;
    }
}
