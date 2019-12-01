public class Leet69_3 {
    public int sqrt(int x){
        double res=x;
        while (res*res>x){
            res=(res+x/res)/2;
        }
        return (int)res;
    }

}
