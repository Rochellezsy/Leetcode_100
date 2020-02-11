public class Leet41 {
    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            while (nums[i]>0 && nums[i]<=len){
                if(nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                }
                else if(nums[i]==nums[nums[i]-1]){
                    break;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;
    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[]nums={3,4,-1,1};
        Leet41 test=new Leet41();
        System.out.println(test.firstMissingPositive(nums));
    }

}
