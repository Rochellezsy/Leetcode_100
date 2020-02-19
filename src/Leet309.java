public class Leet309 {
    public int maxProfit(int[] prices) {
        if(prices.length<2)return 0;
        int [][]dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            if(i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[i];
                continue;
            }
            if(i==1){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
                dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
