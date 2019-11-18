import java.util.ArrayList;
import java.util.List;

public class Leet78_1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        list.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            int size=list.size();
            for(int j=0;j<size;j++){
                temp=new ArrayList<>(list.get(j));
                temp.add(nums[i]);
                list.add(temp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        Leet78_1 test=new Leet78_1();
        List<List<Integer>> list=new ArrayList<>();
        list=test.subsets(nums);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
