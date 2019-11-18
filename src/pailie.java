import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class pailie {
    public ArrayList<String> pl(String str){
        ArrayList<String> res=new ArrayList<>();
        if(str.length()==0){
            return res;
        }
        digui(str.toCharArray(),0, res);
        Collections.sort(res);
        return res;
    }

    public void digui(char[] str, int begin, ArrayList<String>list){
        if(begin==str.length){
            list.add(String.valueOf(str));
        }
        HashSet<Character>set=new HashSet<>();

        for(int i=begin;i<str.length;i++){
            if(!set.contains(str[i])){
                set.add(str[i]);

                char temp=str[begin];
                str[begin]=str[i];
                str[i]=temp;

                digui(str,begin+1,list);

                temp=str[begin];
                str[begin]=str[i];
                str[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        String str="abc";
        pailie test=new pailie();
        ArrayList<String > list=new ArrayList<>();

        list=test.pl(str);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

}
