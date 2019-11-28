import java.util.ArrayList;
import java.util.List;

public class Leet46_2 {
    public List<List<Integer>> permute(int[]nums){
        List<List<Integer>>res =new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        digui(0,n,list,res);

        return res;
    }

    public void digui(int begin,int n, List<Integer> list,List<List<Integer>>res){
        if(begin==n){
            res.add(new ArrayList<>(list));
        }
        else {
            for(int i=begin;i<n;i++){
                int temp=list.get(i);
                list.set(i,list.get(begin));
                list.set(begin,temp);

                digui(begin+1,n,list,res);

                temp=list.get(i);
                list.set(i,list.get(begin));
                list.set(begin,temp);
            }

        }
    }

}
