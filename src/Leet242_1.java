public class Leet242_1 {
    public boolean isAnagram(String s, String t) {
        char[] res=new char[26];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            res[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(res[i]!=0){
                return false;
            }
        }
        return true;

    }
}
