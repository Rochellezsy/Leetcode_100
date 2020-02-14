public class Leet42 {
    public int trap(int[] height) {
        if(height.length==0)return 0;
        int max=height[0];
        int maxindex=0;
        for(int i=0;i<height.length;i++){
            if(max<height[i]){
                max=height[i];
                maxindex=i;
            }
        }
        int ans=0;
        for(int i=0;i<maxindex;i++){
            for(int j=i+1;j<=maxindex;j++){
                if(height[i]>height[j]){
                    ans=ans+height[i]-height[j];
                }
                else {
                    i=j;
                }
            }
        }

        for(int i=height.length-1;i>maxindex;i--){
            for(int j=i-1;j>=maxindex;j--){
                if(height[i]>height[j]){
                    ans=ans+height[i]-height[j];
                }
                else {
                    i=j;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Leet42 test=new Leet42();
        int[]nums={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(test.trap(nums));
    }
}
