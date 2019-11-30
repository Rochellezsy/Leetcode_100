import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permu(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        digui(0,n,list,result);
        return result;


    }

    public void digui(int begin,int n,List<Integer>list,List<List<Integer>>result){
        if(begin==n){
            result.add(new ArrayList<>(list));
        }
        for(int i=begin;i<n;i++){
            int temp=list.get(begin);
            list.set(begin,list.get(i));
            list.set(i,temp);

            digui(begin+1,n,list,result);

            temp=list.get(begin);
            list.set(begin,list.get(i));
            list.set(i,temp);
        }

    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        Permutation test=new Permutation();
//        Leet0078 test=new Leet0078();
        List<List<Integer>> list=new ArrayList<>();
        list=test.permu(nums);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
