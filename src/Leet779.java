public class Leet779 {
    public int kthGrammar(int N, int K) {
        if(K==1)return 0;
        if(K==2)return 1;
        int last=kthGrammar(N-1,(K+1)/2);
        if(last==K%2){
            return 1;
        }else {
            return 0;
        }

    }
}
