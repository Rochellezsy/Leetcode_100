public class Leet05_3 {


    public int ll(String s ,int Left,int Right){
        int L=Left;
        int R=Right;

        while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;

    }

    public String longestPalindrome(String s) {
        String ans="";
        if(s.length()<=1){
            return s;
        }
        int start=0;
        int end=0;

        for(int i=0;i<s.length();i++){
            int len1=ll(s,i,i);
            int len2=ll(s,i,i+1);
            int max= Math.max(len1, len2);

            if(max>end-start){
                start= i-(max-1)/2;
                end=i+ max/2;
                ans=s.substring(start,end+1);

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="abac";
        Leet05_3 test=new Leet05_3();
        System.out.println(test.longestPalindrome(s));
    }


}
