import java.util.Arrays;

public class Leet215 {
    public int findKthLargest(int []nums,int k){
        Arrays.sort(nums);
        int result=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i+k==nums.length){
                result= nums[i];
            }

        }
        return result;
    }

    public void quicksort(int []nums,int left,int right){
        while(left>=right){
            return;
        }
        int p=partition(nums,left,right);

        quicksort(nums,left,p-1);
        quicksort(nums,p+1,right);


    }

    public int partition(int[]nums,int left,int right){
        int i=left+1;
        int j=right;

        while (true){
            while(i<right&&nums[i]<nums[left]){
                i++;
            }

            while(j>left&&nums[j]>nums[left]){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(nums,i,j);
        }
        swap(nums,left,j);
        return j;

    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
