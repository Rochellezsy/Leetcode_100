import java.util.ArrayList;
import java.util.List;

public class Leet46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer>nn=new ArrayList<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            nn.add(nums[i]);
        }
        digui(n,nn,0,list);
        return list;

    }

    public void digui(int n,List<Integer>nums,int begin,List<List<Integer>>list){
        if(begin==n){
            list.add(new ArrayList<>(nums));
        }
        for(int i=begin;i<n;i++){
            int temp=nums.get(i);
            nums.set(i,nums.get(begin));
            nums.set(begin,temp);

            digui(n,nums,begin+1,list);

            temp=nums.get(i);
            nums.set(i,nums.get(begin));
            nums.set(begin,temp);
        }


    }
}
