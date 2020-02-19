public class Leet188 {
    public int maxProfit(int k, int[] prices) {
        if(prices.length<2)return 0;
        int n=prices.length;
        if(k>n/2){
            return max(prices);
        }
        int[][][]dp=new int[prices.length][k+1][2];

        for(int i=0;i<prices.length;i++){
            for(int j=k;j>=1;j--){
                if(i==0){
                    dp[i][j][0]=0;
                    dp[i][j][1]=-prices[i];
                    continue;
                }
                dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[prices.length-1][k][0];

    }

    public int max(int[]prices){
        int[][]dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            if(i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[i];
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
