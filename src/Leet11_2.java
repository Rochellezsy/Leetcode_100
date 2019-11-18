public class Leet11_2 {
    public int maxArea(int[] height) {

        int i=0;
        int j=height.length-1;
        int h;
        int result=0;
        int maxarea=0;

        while(i<j){
            if(height[i]>=height[j]){
                h=height[j];
                result=h*(j-i);
                maxarea=Math.max(maxarea,result);
                j--;
            }
            else if(height[i]<height[j]){
                h=height[i];
                result=h*(j-i);
                maxarea=Math.max(maxarea,result);
                i++;
            }

        }
        return maxarea;

    }
}
