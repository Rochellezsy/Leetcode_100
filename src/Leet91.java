import java.util.ArrayList;
import java.util.List;

public class Leet91 {
    public int numDecodings(String s){
        int n=s.length();
        if(n==0){
            return 0;
        }
        int[] result=new int[n+1];

        result[n]=1;
        result[n-1]=s.charAt(n-1)!='0'?1:0;

        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='0')continue;
            else {
                if(Integer.parseInt(s.substring(i,i+2))<=26){
                    result[i]=result[i+1]+result[i+2];
                }
                else {
                    result[i]=result[i+1];
                }
            }

        }
        s.concat(s);
        return result[0];
    }
}
