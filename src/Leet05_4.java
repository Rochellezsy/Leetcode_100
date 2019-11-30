public class Leet05_4 {
    public String longestPalindrome(String s){
        if(s.length()<=1){
            return s;
        }
        String result=null;
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String szi=s.substring(i,j+1);
                if(szi.length()>max && judge(szi)){
                    max=szi.length();
                    result=szi;
                }
            }
        }
        return result;
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
