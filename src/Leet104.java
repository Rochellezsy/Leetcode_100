public class Leet104 {
    public int maxDepth(TreeNode root) {
        int count=0;
        if(root!=null){
            int lefth=maxDepth(root.left);
            int righth=maxDepth(root.right);
            count=Math.max(lefth,righth)+1;

        }
        return count;


    }


}
