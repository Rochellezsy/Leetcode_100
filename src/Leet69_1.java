public class Leet69_1 {
    public int sqrt(int x){
        if(x==0 ||x==1){
            return x;
        }

        double left=0;
        double right=x;

        double mid=x/2;

        while ((int)left<(int)right){
            if(mid*mid>x){
                right=mid;
                mid=(left+right)/2;
            }
            if(mid*mid<=x){
                left=mid;
                mid=(left+right)/2;
            }
        }
        return (int)mid;


    }










}
