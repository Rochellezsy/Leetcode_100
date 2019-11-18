/*
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。
 */
import java.util.ArrayList;
import java.util.List;

public class Leet78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            int size=list.size();
            for(int j=0;j<size;j++){
                List<Integer>temp=new ArrayList<>(list.get(j));
                temp.add(nums[i]);
                list.add(temp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        Leet78 test=new Leet78();
        List<List<Integer>> list=new ArrayList<>();
        list=test.subsets(nums);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
