/*
输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
 */

public class Leet5 {
    public boolean judge(String s){
        int len=s.length();
        int i=0;
        int j=len-1;
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

    public String longestPalindrome(String s){
        if(s.length()<=1){
            return s;
        }
        String ans="";
        int max=0;


        for(int i=0;i<s.length()-1;i++){
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

    public static void main(String[] args) {
        String s="aa";
        Leet5 test=new Leet5();
        System.out.println(test.longestPalindrome(s));
    }

}
