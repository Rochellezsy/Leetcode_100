import java.util.HashMap;
import java.util.HashSet;

public class Leet1_3 {
    public int[] twoSum(int[] nums,int target){
        int[] result=new int[2];
        int len=nums.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<len;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<len;i++){
            int ans=target-nums[i];
            if(map.containsKey(ans) && map.get(ans)!=i){
                result[0]=i;
                result[1]=map.get(ans);

            }

        }
        return result;

    }
}
