import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet46_1 {
    private List<List<Integer>>res=new ArrayList<>();

    public void back(String combination,int[]nums){
        if(nums.length==0){
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<combination.length();i++){
                Character s=combination.charAt(i);
                list.add(Integer.parseInt(String.valueOf(s)));
            }
            res.add(list);
        }
        else {
            for(int i=0;i<nums.length;i++){
                String add=String.valueOf(nums[i]);
                int temp=nums[i];
                nums[i]=nums[0];
                nums[0]=temp;
                back(combination+add, Arrays.copyOfRange(nums,1,nums.length));
            }
        }


    }

    public List<List<Integer>> permute(int[] nums) {
        if(nums.length!=0){
            back("",nums);
        }
        return res;
    }
}
