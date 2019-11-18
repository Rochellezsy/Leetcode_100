import java.util.ArrayList;
import java.util.List;

/*
本解法采用回溯算法实现，回溯算法的基本形式是“递归+循环”，正因为循环中嵌套着递归，递归中包含循环，
这才使得回溯比一般的递归和单纯的循环更难理解，其实我们熟悉了它的基本形式，
就会觉得这样的算法难度也不是很大。原数组中的每个元素有两种状态：存在和不存在。

① 外层循环逐一往中间集合 temp 中加入元素 nums[i]，使这个元素处于存在状态
② 开始递归，递归中携带加入新元素的 temp，并且下一次循环的起始是 i 元素的下一个，因而递归中更新 i 值为 i + 1
③ 将这个从中间集合 temp 中移除，使该元素处于不存在状态
 */

public class Leet0078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        dfs(list,temp,nums,0);

        return list;
    }

    public void dfs(List<List<Integer>>list,List<Integer>temp,int[] nums,int begin){

        list.add(new ArrayList<Integer>(temp));
        for(int i=begin;i<nums.length;i++){
            temp.add(nums[i]);
            dfs(list,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }

    }



    public static void main(String[] args) {
        int[] nums={1,2,3};
        Leet0078 test=new Leet0078();
        List<List<Integer>> list=new ArrayList<>();
        list=test.subsets(nums);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
