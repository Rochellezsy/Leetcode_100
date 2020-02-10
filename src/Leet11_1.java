public class Leet11_1 {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int res=0;

        while(i<j){
            if(height[i]<=height[j]){
                int ans=height[i]*(j-i);
                res=Math.max(res,ans);
                i++;
            }
            else {
                int ans=height[j]*(j-i);
                res=Math.max(res,ans);
                j--;
            }
        }
        return res;

    }
}
