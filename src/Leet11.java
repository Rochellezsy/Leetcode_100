public class Leet11 {
    public int maxArea(int[] height) {
        int ans;
        int result=0;
        int max=0;

        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int minh=Math.min(height[i],height[j]);
                result=minh*(j-i);
                max=Math.max(result,max);
            }
        }
        return max;

    }


}
