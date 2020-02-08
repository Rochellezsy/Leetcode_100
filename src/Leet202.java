public class Leet202 {
    public boolean isHappy(int n) {
        int fast=change(n);
        int slow=change(n);
        fast=change(fast);
        while(fast!=slow){
            fast=change(fast);
            fast=change(fast);
            slow=change(slow);
        }
        if(fast==1){
            return true;
        }
        return false;

    }

    public int change(int n){
        int res=0;
        while(n!=0){
            int ans=n%10;
            res=res+ans*ans;
            n=n/10;
        }
        return res;
    }
}
