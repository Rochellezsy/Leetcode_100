public class Leet334 {
    public boolean increasingTriplet(int[] nums) {

        int small=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
            else if(nums[i]!=small && nums[i]<mid){
                mid=nums[i];
            }
            else if(nums[i]>mid){
                return true;
            }
        }
        return false;

    }
}
