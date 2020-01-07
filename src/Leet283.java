public class Leet283 {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<j && j<nums.length){
            if(nums[i]!=0){
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }

        }

    }
}
