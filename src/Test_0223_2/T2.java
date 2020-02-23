package Test_0223_2;

public class T2 {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;

        while(true){
            while(i<nums.length && nums[i]!=0){
                i++;
            }
            j=i+1;
            while(j<nums.length && nums[j]==0){
                j++;
            }
            if(i<nums.length && j<nums.length){
                swap(nums,i,j);
            }else{
                return;
            }
        }

    }
    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
