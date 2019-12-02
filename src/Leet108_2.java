public class Leet108_2 {
    public TreeNode transfer(int[]nums){

        return digui(nums,0,nums.length);
    }

    public TreeNode digui(int[]nums,int start,int end){
        if(start==end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=digui(nums,start,mid);
        root.right=digui(nums,mid+1,end);

        return root;

    }
}
