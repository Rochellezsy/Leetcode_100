public class Leet75 {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int curr=0;

        while(curr<j){
            if(nums[curr]==2){
                swap(nums,curr,j);
                j--;
            }
            else if(nums[curr]==0){
                swap(nums,curr,i);
                i++;
                curr++;
            }
            else {
                curr++;
            }
        }

    }
    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
