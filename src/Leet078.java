import java.util.ArrayList;
import java.util.List;

/*
这种方法是一种组合的方式
① 最外层循环逐一从 nums 数组中取出每个元素 num
② 内层循环从原来的结果集中取出每个中间结果集，并向每个中间结果集中添加该 num 元素
③ 往每个中间结果集中加入 num
④ 将新的中间结果集加入结果集中
 */

public class Leet078 {
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
        Leet078 test=new Leet078();
        List<List<Integer>> list=new ArrayList<>();
        list=test.subsets(nums);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }


}
