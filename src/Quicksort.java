public class Quicksort {
    public void quicksort(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int p=partition(nums,left,right);

        quicksort(nums, left,p-1);
        quicksort(nums,p+1,right);


    }

    public int partition(int[]nums,int left,int right){
        int i=left+1;
        int j=right;
        int value=nums[left];

        while(true){

            while(i<right &&nums[i]<value ){
                i++;
            }
            while(j>left &&nums[j]>value){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(nums,i,j);

        }
        swap(nums,left,j);


        return j;

    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }

    public static void main(String[] args) {
        Quicksort test=new Quicksort();
        int[]nums={5,3,2,5,6,3,8};
        int[] arr={5,1,2,3,6,7,8};
        test.quicksort(nums,0,6);
        test.quicksort(arr,0,6);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
