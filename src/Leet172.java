public class Leet172 {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            count=count+n/5;
            n=n/5;
        }
        return count;

    }
}