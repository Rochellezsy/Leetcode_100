public class Leet461 {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        int count=0;
        while(res!=0){
            count++;
            res=res&(res-1);
        }
        return count;



    }
}
