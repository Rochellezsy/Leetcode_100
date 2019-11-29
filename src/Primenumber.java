import java.util.ArrayList;
import java.util.List;

public class Primenumber {
    public List<Integer> prime(int n){
        List<Integer> list =new ArrayList<>();
        for(int i=2;i<n;i++){
            if(judeg(i)){
                list.add(i);
            }
        }
        return list;

    }

    public boolean judeg(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Primenumber primenumber = new Primenumber();
        List<Integer> prime = primenumber.prime(100);
        for (Integer integer : prime) {
            System.out.println(integer);
        }
    }


}
