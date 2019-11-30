public class Leet543 {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans-1;

    }

    public int depth(TreeNode root){
        if(root!=null){
            int left=depth(root.left);
            int right=depth(root.right);

            ans=Math.max(ans,left+right+1);
            return Math.max(left,right)+1;
        }
        return 0;
    }
}
