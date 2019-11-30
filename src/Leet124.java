public class Leet124 {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        digui(root);
        return res;

    }

    public int digui(TreeNode root){
        if(root==null)return 0;

        int left=digui(root.left);
        int right=digui(root.right);
        res=Math.max(left+right+root.val,res);
        return Math.max(0,Math.max(left,right)+root.val);
    }
}
