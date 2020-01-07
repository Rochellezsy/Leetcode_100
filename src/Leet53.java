public class Leet53 {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int res=Integer.MIN_VALUE;
        int ans=res;
        for(int i=0;i<nums.length;i++){
            if(res<0){
                res=nums[i];
            }
            else {
                res=res+nums[i];
            }
            if(ans<res){
                ans=res;
            }
        }
        return ans;

    }
}
