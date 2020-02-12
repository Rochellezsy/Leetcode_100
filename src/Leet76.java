import java.util.HashMap;

public class Leet76 {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int count=map.size();
        int left=0;
        int right=0;
        int len=Integer.MAX_VALUE;
        int index=0;

        while(right<s.length()){
            char cright=s.charAt(right);
            if(map.containsKey(cright)){
                map.put(cright,map.get(cright)-1);
                if(map.get(cright)==0){
                    count--;
                }
            }
            right++;

            while(count==0){
                if(len>right-left){
                    len=right-left;
                    index=left;
                }

                char cleft=s.charAt(left);
                if(map.containsKey(cleft)){
                    map.put(cleft,map.get(cleft)+1);
                    if(map.get(cleft)==1){
                        count++;
                    }
                }
                left++;
            }
        }
        if(left==0&& right==s.length()&&count!=0){
            return "";
        }
        return s.substring(index,index+len);
    }

    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        Leet76 test=new Leet76();
        System.out.println(test.minWindow(s,t));
    }
}
