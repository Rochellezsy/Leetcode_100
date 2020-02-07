import java.util.Arrays;

public class Leet322 {
    public int coinChange(int[] coins, int amount) {
        int[]dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int i=0;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(i>=coins[j]){
                    int curr=dp[i-coins[j]]+1;
                    dp[i]=Math.min(dp[i],curr);
                }
            }
        }
        if(dp[amount]==amount+1){
            return -1;
        }
        return dp[amount];

    }
}
