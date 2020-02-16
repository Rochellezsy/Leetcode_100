public class Leetoffer62_1 {
    public int lastRemaining(int n, int m) {
        if(n==1)return 0;
        return (lastRemaining(n-1,m)+(m-1)%n+1)%n;

    }
}
