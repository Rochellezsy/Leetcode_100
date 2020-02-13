public class Leet124_1 {
    Integer res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        digui(root);
        return res;

    }

    public int digui(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(digui(root.left),0);
        int right=Math.max(digui(root.right),0);
        res=Math.max(left+right+root.val,res);
        return Math.max(left,right)+root.val;

    }
}
