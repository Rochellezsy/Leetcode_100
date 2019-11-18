public class Leet011 {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int h;
        int area;
        int max=0;

        while(i<j){
            if(height[i]<=height[j]){
                h=height[i];
                area=h*(j-i);
                max=Math.max(max,area);
                i++;
            }
            else if(height[i]>height[j]){
                h=height[j];
                area=h*(j-i);
                max=Math.max(max,area);
                j--;
            }
        }
        return max;

    }
}
