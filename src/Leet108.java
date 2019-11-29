public class Leet108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums, 0, nums.length);
    }

    public TreeNode sorted(int[]nums,int start,int end){
        if(start==end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sorted(nums,start,mid);
        root.right=sorted(nums,mid+1,end);
        return root;

    }


}
