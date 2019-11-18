import java.util.LinkedList;
import java.util.List;

public class Leet17_3 {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<String>();
        if(digits.length()==0) {return list;}
        String[] digit=new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        list.add("");
        for(int i=0; i<digits.length(); i++) {
            String str1= digit[digits.charAt(i)-'2'];
            int size = list.size();
            for(int j=0; j<size; j++) {
                String strFormer = list.poll();
                for(int t=0; t<str1.length(); t++) {
                    list.add(strFormer+str1.charAt(t));
                }
            }
        }
        return list;
    }
}
