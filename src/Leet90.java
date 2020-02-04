import javax.crypto.AEADBadTagException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet90 {
    List<List<Integer>>res=new ArrayList<>();
    public void back(List<Integer>list,int[]nums,int index){
        if(index==nums.length){
            Collections.sort(list);
            if(!res.contains(list)){
                res.add(list);
            }
        }
        else {
            List<Integer>templist=new ArrayList<>(list);
            templist.add(nums[index]);
            back(templist,nums,index+1);
            back(list,nums,index+1);
        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length!=0){
            back(new ArrayList<>(),nums,0);
        }
        return res;

    }
}
