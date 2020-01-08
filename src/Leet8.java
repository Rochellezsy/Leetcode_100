public class Leet8 {
    public int myAtoi(String str) {
        str=str.trim();
        char[]ss=str.toCharArray();

        int len=ss.length;
        int i=0;
        int flag=1;
        long ans=0;

        if(i<len && ss[i]=='-'){
            flag=-1;
            i++;
        }
        else if(i<len && ss[i]=='+'){
            flag=1;
            i++;
        }
        else if(i<len && (ss[i]<'0'||ss[i]>'9')){
            return 0;
        }

        while(i<len &&ss[i]>='0'&&ss[i]<='9'){
            ans=ans*10+ss[i]-'0';
            if(ans!=(int)ans){
                return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            i++;
        }
        ans=ans*flag;

        return (int) ans;


    }
}
