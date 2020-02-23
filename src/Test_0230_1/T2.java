package Test_0230_1;

public class T2 {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(0)){
                String zi=s.substring(0,i);
                if(judge(s,zi)){
                    return true;
                }
                continue;
            }
        }
        return false;


    }

    public boolean judge(String s,String zi){
        while(s.length()>zi.length()){
            if(zi.equals(s.substring(0,zi.length()))){
                s=s.substring(zi.length());
            }
            else {
                return false;
            }
        }
        return s.equals(zi);
    }

    public static void main(String[] args) {
        T2 test=new T2();
        System.out.println(test.repeatedSubstringPattern("aabaaba"));
    }
}
