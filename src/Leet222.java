public class Leet222 {
    public int countNodes(TreeNode root) {
        return digui(root,0);

    }
    public int digui(TreeNode root,int num){
        if(root==null)return 0;
        int left=digui(root.left,num);
        int right=digui(root.right,num);
        return left+right+1;
    }
}
