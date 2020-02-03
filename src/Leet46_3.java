import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet46_3 {
    List<List<Integer>>res=new ArrayList<>();

    public void back(List<Integer> list,int[] nums){
        if(nums.length==0){
            res.add(list);
        }
        else {
            for(int i=0;i<nums.length;i++){
                List<Integer> templist=new ArrayList<>(list);
                templist.add(nums[i]);
                int temp=nums[i];
                nums[i]=nums[0];
                nums[0]=temp;
                back(templist, Arrays.copyOfRange(nums,1,nums.length));
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length!=0){
            List<Integer>list=new ArrayList<>();
            back(list,nums);
        }
        return res;
    }
}
