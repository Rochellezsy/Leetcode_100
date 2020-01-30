import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leet49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();

        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String ss=String.valueOf(ch);
            if(!map.containsKey(ss)){
                map.put(ss,new ArrayList<>());
            }
            map.get(ss).add(s);
        }

        for(List<String> list:map.values()){
            res.add(list);
        }

        return res;

    }
}
