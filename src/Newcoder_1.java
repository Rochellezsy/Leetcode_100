import java.util.Scanner;

public class Newcoder_1 {
    public int solution(int a){
        for(int n=10;n<100;n++){
            if((n-1)%a==0){
                return n;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        Newcoder_1 test=new Newcoder_1();
        int x=test.solution(a);

//        System.out.println();
        System.out.println(x);

    }


}
