public class Leet238 {
    public int[] productExceptSelf(int[] nums) {
        int ans=1;
        int[]res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=ans;
            ans=ans*nums[i];
        }
        ans=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*ans;
            ans=ans*nums[i];
        }
        return res;

    }
}
