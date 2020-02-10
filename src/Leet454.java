import java.util.HashMap;

public class Leet454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i : A) {
            for (int j : B) {
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        int count=0;

        for (int i : C) {
            for (int j : D) {
                count=count+map.getOrDefault(-(i+j),0);
            }
        }
        return count;

    }
}
