import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet912_1 {
    public List<Integer> sortArray(int[] nums) {
        kuaipai(nums,0,nums.length);
        List<Integer>list=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;

    }

    public void kuaipai(int[] nums,int left ,int right){
        if(left>=right){
            return;
        }
        int part=partition(nums,left,right);
        kuaipai(nums,left,part-1);
        kuaipai(nums,part+1,right);
    }

    public int partition(int[]nums,int left,int right){
        if(nums.length==0)return 0;
        int pivot=nums[left];
        int i=left;
        int j=right;
        while(true){
            while(i<right && nums[i]<=pivot){
                i++;
            }
            while(j>left && nums[j]>pivot){
                j--;
            }

            if(i<j){
                swap(nums,i,j);
            }
            else{
                break;
            }
        }
        swap(nums,left,j);
        return j;
    }

    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
