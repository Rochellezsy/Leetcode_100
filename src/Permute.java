import java.util.ArrayList;
import java.util.List;

public class Permute {
    public List<List<Integer>> pailie(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
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
        int[] nums={1,2,3};
        Permute test=new Permute();
//        Leet0078 test=new Leet0078();
        List<List<Integer>> list=new ArrayList<>();
        list=test.pailie(nums);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
