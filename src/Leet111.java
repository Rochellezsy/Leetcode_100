public class Leet111 {
    public int minDepth(TreeNode root){
        int count=0;
        if(root!=null){
            int left=minDepth(root.left);
            int right=minDepth(root.right);
            count=Math.min(left,right)+1;
        }
        return count;
    }
}
