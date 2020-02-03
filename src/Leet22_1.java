import java.util.ArrayList;
import java.util.List;

public class Leet22_1 {
    List<String>res=new ArrayList<>();

    public void back(String combination,int left,int right){
        if(left==0&&right==0){
            res.add(combination);
        }
        if(left<right ||left<0 ||right<0){
            return;
        }
        back(combination+"(",left-1,right);
        back(combination+")",left,right-1);
    }
    public List<String> generateParenthesis(int n) {

        if(n!=0){
            back("",n,n);
        }
        return res;

    }
}
