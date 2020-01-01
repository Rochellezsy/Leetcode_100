import java.util.Random;

public class Leet384 {
    int[] origin;
    int[] array;

    Random random=new Random();


    public Leet384(int[] nums) {
        this.origin=nums.clone();
        this.array=nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.origin;

    }

    public int randomInt(int min,int max){
        return random.nextInt(max-min)+min;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0;i<array.length;i++){
            swap(array,i,randomInt(i,array.length));
        }
        return array;
    }

    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

}
