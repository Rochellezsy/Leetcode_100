import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leet015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<3){
            return list;
        }

        for(int k=0;k<nums.length-2;k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            if(nums[k]>0){
                break;
            }
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> p=new ArrayList<>();
                    p.add(nums[k]);
                    p.add(nums[i]);
                    p.add(nums[j]);
                    list.add(p);
                    while(i<j && nums[i]==nums[i+1]){
                        i++;
                    }
                    while(i<j&&nums[j]==nums[j-1]){
                        j--;
                    }
                    i++;
                    j--;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    j--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    i++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int []nums={-2,0,3,-1,4,0,3,4,1,1,1,-3,-5,4,0};
        Leet015 test=new Leet015();
        System.out.println(test.threeSum(nums));

    }


}
