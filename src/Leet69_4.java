public class Leet69_4 {
    public int sqrt(int x){
        double res=x;
        if(res*res>x){
            res=(res+x/res)/2;
        }
        return (int)res;
    }
}
