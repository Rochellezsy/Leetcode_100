package Test_0230_1;

public class T3 {
    int answer=0;

    public int countDigitOne(int n) {
        int dp=0;
        for(int i=1;i<=n;i++){
            dp+=count(i);
        }
        return dp;
    }

    public int count(int n){
        int count=0;
        while(n!=0){
            if(n==10){
                count++;
                break;
            }
            else if(n%10==1){
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        T3 test=new T3();
        System.out.println(test.countDigitOne(3184191));
    }
}
