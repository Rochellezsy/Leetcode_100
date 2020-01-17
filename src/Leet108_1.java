import java.util.Arrays;

public class Leet108_1 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len=nums.length;
        if(len==0)return null;
        int mid=len/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return root;

    }
}
