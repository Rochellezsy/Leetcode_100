public class Leet34 {
    public int[] searchRange(int[] nums, int target) {
        int[]res=new int[2];
        res[0]=-1;
        res[1]=-1;

        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]==target){
                while(nums[left]!=target){
                    left++;
                }
                while(nums[right]!=target){
                    right--;
                }
                res[0]=left;
                res[1]=right;
                return res;
            }
        }

        return res;

    }
}
