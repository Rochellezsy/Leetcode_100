import java.util.LinkedList;

public class Leet239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<=1)return nums;
        LinkedList<Integer>list=new LinkedList<>();
        int[]res=new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){
            if(list.isEmpty()){
                list.add(i);
            }
            if(!list.isEmpty()&&list.peekFirst()<=i-k){
                list.pollFirst();
            }
            if(!list.isEmpty() && nums[list.peekLast()]>nums[i]){
                list.add(i);
            }
            while(!list.isEmpty()&&nums[list.peekLast()]<=nums[i]){
                list.pollLast();
            }
            list.add(i);
            if(i-k+1>=0){
                res[i-k+1]=nums[list.peekFirst()];
            }
        }
        return res;


    }
}
