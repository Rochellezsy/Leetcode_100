
import java.util.HashMap;
import java.util.HashSet;


public class Leet03 {
    public int lengthOfLongestSubstring(String s) {


        int n = s.length(), ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha)+1, start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end);
        }
        return ans;


    }
}
