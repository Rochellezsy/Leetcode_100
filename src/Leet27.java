public class Leet27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)return 0;
        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(nums[j]==val){
                j--;
            }
            if(nums[i]==val){
                swap(nums,i,j);
                j--;
            }
            else {
                i++;
            }
        }
        if(nums[0]==val){
            return 0;
        }

        for(int k=1;k<nums.length;k++){
            if(nums[k]==val){
                return k-1;
            }
        }
        return nums.length;

    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        Leet27 test=new Leet27();
        int[]nums={3,2,2,3};
        test.removeElement(nums,3);
    }
}
