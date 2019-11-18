public class Leet05 {

    public boolean longp(String s){
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;

    }

    public String longestPalindrome(String s) {
        String ans="";
        int max=0;

        if(s.length()==0||s.length()==1){
            return s;
        }


        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String szi=s.substring(i,j);
                if(szi.length()>max && longp(szi)){
                    max=szi.length();
                    ans=szi;
                }
            }

        }

        return ans;
    }
}
