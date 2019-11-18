import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Leet15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();

        if(nums==null ||nums.length<3){
            return ans;
        }
        Arrays.sort(nums);


        for(int k=0;k<nums.length-2;k++){
            if(nums[k]>0){
                break;
            }
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                if(nums[k]+nums[i]+nums[j]==0 ){
                    ans.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    while(i<j &&nums[i]==nums[i+1]){
                        i++;
                    }
                    while(i<j && nums[j]==nums[j-1]){
                        j--;
                    }
                    i++;
                    j--;
                }
                else if(nums[k]+nums[i]+nums[j]>0){
                    j--;
                }
                else if(nums[k]+nums[i]+nums[j]<0){
                    i++;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int []nums={-2,0,3,-1,4,0,3,4,1,1,1,-3,-5,4,0};
        Leet15 test=new Leet15();
        System.out.println(test.threeSum(nums));

    }

}
