public class Leet123_1 {
    public int maxProfit(int[] prices) {
        if(prices.length<2)return 0;
        int[][][] dp=new int[prices.length][3][2];
        for(int i=0;i<prices.length;i++){
            for(int j=2;j>=1;j--){
                if(i==0){
                    dp[i][j][0]=0;
                    dp[i][j][1]=-prices[0];
                    continue;
                }
                dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[prices.length-1][2][0];

    }
}
