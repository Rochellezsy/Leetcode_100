import java.util.Arrays;

public class Leet108_4 {
    public TreeNode sortedArrayToBST(int[] nums) {

        int n=nums.length;
        if(n==0)return null;
        int x=n/2;
        TreeNode root=new TreeNode(nums[x]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,x));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,x+1,nums.length));
        return root;
    }
}
