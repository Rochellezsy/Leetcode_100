import java.util.ArrayList;
import java.util.List;

public class Leet784 {
    List<String>res=new ArrayList<>();

    public void back(String combination,String s,int index){
        if(index==s.length()){
            res.add(combination);
        }
        else {
            if(s.charAt(index)>='a'&&s.charAt(index)<='z'){
                String ss=s.substring(index,index+1).toUpperCase();
                back(combination,s,index+1);
                back(combination.substring(0,index)+ss+combination.substring(index+1),s,index+1);
            }
            else if(s.charAt(index)>='A'&&s.charAt(index)<='Z'){
                String ss=s.substring(index,index+1).toLowerCase();
                back(combination,s,index+1);
                back(combination.substring(0,index)+ss+combination.substring(index+1),s,index+1);
            }
            else {
                back(combination,s,index+1);
            }
        }

    }

    public List<String> letterCasePermutation(String S) {
        if(S.length()!=0){
            back(S,S,0);
        }
        return res;
    }

    public static void main(String[] args) {
        String S="a1b2";
        Leet784 test=new Leet784();
        test.letterCasePermutation(S);
    }
}
