import java.util.Arrays;

public class Leet300 {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int[]dp=new int[n];
        Arrays.fill(dp,1);
        dp[0]=1;
        int max=1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    int curr=dp[j]+1;
                    dp[i]=Math.max(curr,dp[i]);
                    if(dp[i]>max){
                        max=dp[i];
                    }
                }
            }

        }
        return max;


    }
}
