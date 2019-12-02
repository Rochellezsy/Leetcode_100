public class Leet104_4 {
    public int maxDepth(TreeNode root){
        int count=0;
        while(root!=null){
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);
            count=Math.max(left,right)+1;
        }
        return count;
    }
}
