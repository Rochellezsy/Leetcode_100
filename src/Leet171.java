import java.util.HashMap;

public class Leet171 {
    public int titleToNumber(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=s.length()-1;
        for(int i=0;i<26;i++){
            map.put((char) ('A'+i),i+1);
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            Character letter=s.charAt(i);
            int value=map.get(letter);
            for(int j=0;j<len-i;j++){
                value=value*26;
            }
            ans=ans+value;
        }
        return ans;
    }
}
