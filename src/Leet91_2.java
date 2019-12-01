public class Leet91_2 {
    public int numDecodings(String s) {
        int n=s.length();

        int res[]=new int[n+1];

        res[n]=1;
        res[n-1]=s.charAt(n-1)=='0'?0:1;

        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='0')continue;
            if(Integer.parseInt(s.substring(i,i+2))<=26){
                res[i]=res[i+1]+res[i+2];
            }else {
                res[i]=res[i+1];
            }
        }
        return res[0];

    }
}
