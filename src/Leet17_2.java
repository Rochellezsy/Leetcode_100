import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Leet17_2 {
    List<String> out=new ArrayList<>();

    public void back(String combinations,String nextdigits){
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");


        if(nextdigits.length()==0){
            out.add(combinations);
        }
        else{
            String letter=nextdigits.substring(0,1);
            String letterstring=map.get(letter);

            for(int i=0;i<letterstring.length();i++){
                String adding=letterstring.substring(i,i+1);
                String nextd=nextdigits.substring(1);
                back(combinations+adding,nextd);

            }

        }






    }


    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0){
            back("",digits);
        }
        return out;

    }
}
