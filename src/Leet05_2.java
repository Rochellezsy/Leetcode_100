public class Leet05_2 {
    public String longestPalindrome(String s){
        int ans=0;
        String result = "";
        if(s.length()<=1){
            return s;
        }

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String zi=s.substring(i,j+1);
                int len=j-i+1;
                if(len>ans && judge(zi)){
                    ans=len;
                    result=zi;
                }
            }
        }
        return result;


    }

    public Boolean judge(String s){

        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s="aa";
        Leet05_2 test=new Leet05_2();
        System.out.println(test.longestPalindrome(s));
    }


}
