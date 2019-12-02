public class Leet108_3 {
    public TreeNode transfer(int[]nums){
        int n=nums.length;
        return digui(nums,0,n);
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
