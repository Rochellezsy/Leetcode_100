public class Leet69 {
    public int mySqrt(int x) {

        if(x==0||x==1){
            return x;
        }
        double left=0;
        double right=x;
        double mid=x/2;
        while((int)left<(int)right){
            if(mid*mid>x){
                right=mid;
                mid=(left+right)/2;
            }
            else{
                left=mid;
                mid=(left+right)/2;
            }

        }

        return (int)mid;

    }

    public static void main(String[] args) {
        int x=8;
        Leet69 test=new Leet69();

        System.out.print(test.mySqrt(4));
    }
}
