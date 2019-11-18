import java.util.ArrayList;
import java.util.List;

public class Leet22 {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        digui(n,n,"",list);
        return list;

    }

    public void digui(int left, int right, String out, List<String>list){
        if(left<0 || right<0 || left>right){
            return;
        }
        if(left==0 && right==0){
            list.add(out);
        }
        digui(left-1,right,out+"(",list);
        digui(left,right-1,out+")",list);


    }

}
