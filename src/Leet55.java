import java.util.Arrays;

public class Leet55 {
    public boolean canJump(int[] nums) {
        if(nums.length<=1){
            return true;
        }

        int[] dp=new int[nums.length];
        Arrays.fill(dp,0);
        dp[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(dp[j]>=i){
                    dp[i]=i+nums[i];
                    if(dp[i]>=nums.length-1){
                        return true;
                    }
                    break;
                }
            }
        }
        return false;

    }
}
