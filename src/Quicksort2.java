public class Quicksort2 {
    public void quicksort(int[]nums,int left,int right){
        if(left>=right)return;
        int part=partition(nums,left,right);
        quicksort(nums,left,part-1);
        quicksort(nums,part+1,right);
    }

    public int partition(int[]nums,int left,int right){
        int i=left+1;
        int j=right;
        int povit=nums[left];

        while(true){
            while (i<right && nums[i]<povit){
                i++;
            }
            while(j>left && nums[j]>povit){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }else {
                break;
            }
        }

        swap(nums,left,j);
        return j;
    }

    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[]nums={3,1,5,12,9,24};
        Quicksort2 test=new Quicksort2();
        test.quicksort(nums,0,5);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
