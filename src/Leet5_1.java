public class Leet5_1 {
    public String longestPalindrome(String s) {
        String ans="";
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String szi=s.substring(i,j+1);
                if(szi.length()>max && judge(szi)){
                    max=szi.length();
                    ans=szi;
                }
            }
        }
        return ans;

    }

    public boolean judge(String szi){
        int i=0;
        int j=szi.length()-1;
        while(i<=j){
            if(szi.charAt(i)==szi.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
