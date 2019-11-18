public class Leet338 {
    public int[] countBits(int num) {
        int []res =new int[num+1];

        for(int i=0;i<num+1;i++){
            int n=i;
            int count=0;
            while(n!=0){
                count++;
                n=n&(n-1);

            }
            res[i]=count;
        }
        return res;

    }
}
