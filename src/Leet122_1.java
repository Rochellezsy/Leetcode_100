public class Leet122_1 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int[]dp=new int[prices.length];
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[i-1]){
                dp[i]=dp[i-1];
            }
            else {
                dp[i]=dp[i-1]+prices[i]-prices[i-1];
            }
        }
        return dp[dp.length-1];

    }
}
