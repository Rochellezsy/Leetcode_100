public class Leetoffer62 {
    public int lastRemaining(int n, int m) {
        int last=0;
        for(int i=2;i<=n;i++){
            last=(last+(m-1)%i+1)%i;
        }
        return last;

    }
}
