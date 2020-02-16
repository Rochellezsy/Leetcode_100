public class Leetoffer10_0_1 {
    public void merge(int[] A, int m, int[] B, int n) {
        int index=m+n-1;

        while(m>0 && n>0){
            if(A[m-1]>=B[n-1]){
                A[index]=A[m-1];
                m--;
            }
            else if(A[m-1]<B[n-1]){
                A[index]=B[n-1];
                n--;
            }
            index--;
        }

        if(m==0){
            while(n>0){
                A[index]=B[n-1];
                index--;
                n--;
            }
        }

        if(n==0){
            while(m>0){
                A[index]=A[m-1];
                index--;
                m--;
            }
        }


    }
}
