/*
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

 */

import java.util.HashMap;

public class Leet1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }



        for(int i=0;i<nums.length;i++){
            int ans=target-nums[i];
            if(map.containsKey(ans) && map.get(ans)!=i){
                result[0]=i;
                result[1]=map.get(ans);
                return result;
            }

        }
        return null;

    }


}
