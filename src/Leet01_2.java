/*
用了hashmap解法
 */

import java.util.HashMap;

public class Leet01_2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]a=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int ans=target-nums[i];
            if(map.containsKey(ans)&&map.get(ans)!=i  ){
                a[0]=i;
                a[1]=map.get(ans);
            }
        }
        return a;

    }
}
