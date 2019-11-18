public class Leet069 {
    public double mySqrt(int x) {
        double res=x;
        while(res*res>x){
            res=(res+x/res)/2;
        }
        return res;
    }
    public static void main(String[] args) {
        int x=8;
        Leet069 test=new Leet069();

        System.out.print(test.mySqrt(8));
    }
}
