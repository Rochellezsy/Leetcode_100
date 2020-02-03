import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet39 {
    List<List<Integer>>res=new ArrayList<>();

    public void back(int sum,List<Integer>list,int[]candidates,int target){
        if(sum==target){
            Collections.sort(list);
            if(!res.contains(list)){
                res.add(list);
            }
        }
        else if(sum<target){
            for(int i=0;i<candidates.length;i++){
                List<Integer>templist=new ArrayList<>(list);
                templist.add(candidates[i]);
                back(sum+candidates[i],templist,candidates,target);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length!=0){
            back(0,new ArrayList<>(),candidates,target);
        }

        return res;
    }
}
