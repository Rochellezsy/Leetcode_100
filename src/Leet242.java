import javax.crypto.AEADBadTagException;
import java.util.Arrays;

public class Leet242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);

    }
}
