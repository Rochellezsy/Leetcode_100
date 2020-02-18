public class Leet121_1 {
    public int maxProfit(int[] prices) {
        int[]dp=new int[prices.length];
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                dp[i]=0;
            }
            dp[i]=prices[i]-min;
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;

    }
}
