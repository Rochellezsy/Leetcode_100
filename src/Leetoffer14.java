public class Leetoffer14 {
    public int cuttingRope(int n) {
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=1;j<i;j++){
                int temp=Math.max(j*(i-j),j*dp[i-j]);
                dp[i]=Math.max(dp[i],temp);
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        Leetoffer14 test=new Leetoffer14();
        System.out.println(test.cuttingRope(4));
    }
}
