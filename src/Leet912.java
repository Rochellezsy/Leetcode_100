import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet912 {
    public List<Integer> sortArray(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int []res=guibing(nums);
        for (int re : res) {
            list.add(re);
        }
        return list;
    }

    public int[] guibing(int[] nums){
        if(nums.length==0 ||nums.length==1)return nums;
        int len=nums.length-1;
        int mid=len/2;

        int[] left=guibing(Arrays.copyOfRange(nums,0,mid+1));
        int[] right=guibing(Arrays.copyOfRange(nums,mid+1,nums.length));

        return merge(left,right);

    }

    public int[] merge(int[] nums1,int[] nums2){
        int i=nums1.length-1;
        int j=nums2.length-1;
        int index=nums1.length+nums2.length-1;
        int[]res=new int[index+1];

        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                res[index]=nums1[i];
                i--;
                index--;
            }
            else if(nums1[i]<nums2[j]){
                res[index]=nums2[j];
                j--;
                index--;
            }
        }

        while(i>=0){
            res[index]=nums1[i];
            index--;
            i--;
        }
        while(j>=0){
            res[index]=nums2[j];
            index--;
            j--;
        }
        return res;

    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        int[] nums={5,1,1,2,0,0};
        Leet912 test=new Leet912();
        list=test.sortArray(nums);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
