import java.util.ArrayList;
import java.util.List;

public class Leet9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        List<Integer> list=new ArrayList<>();
        while(x!=0){
            int ans=x%10;
            list.add(ans);
            x=x/10;
        }
        int size=list.size();
        for(int i=0;i<size/2;i++){
            if(list.get(i)!=list.get(size-1-i)){
                return false;
            }

        }
        return true;

    }
}
