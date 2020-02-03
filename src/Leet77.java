import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet77 {
    List<List<Integer>>res=new ArrayList<>();

    public void back(int begin,List<Integer>list,int nums[],int k){
        if(begin==k){
            res.add(list);
        }
        else {
            for(int i=0;i<nums.length;i++){
                List<Integer>templist=new ArrayList<>(list);
                templist.add(nums[i]);
                back(begin+1,templist, Arrays.copyOfRange(nums,i+1,nums.length),k);
            }
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        if(n!=0){
            back(0,new ArrayList<>(),nums,k);
        }
        return res;

    }
}
