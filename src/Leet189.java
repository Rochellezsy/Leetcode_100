public class Leet189 {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;

        fanzhuan(nums,0,nums.length-1);
        fanzhuan(nums,0,k-1);
        fanzhuan(nums,k-1,nums.length-1);

    }


    public void fanzhuan(int[]arrays,int start,int end){
        while(start<end){
            int temp=arrays[start];
            arrays[start]=arrays[end];
            arrays[end]=temp;
            start++;
            end--;
        }
    }
}
