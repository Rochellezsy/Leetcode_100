import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Leet973 {
    public int[][] kClosest(int[][] points, int K) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<points.length;i++){
            Integer distance= points[i][0]*points[i][0]+points[i][1]*points[i][1];
            map.put(i,distance);
        }

        PriorityQueue<Integer>queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(b)-map.get(a);
            }
        });
        int[]num=new int[K];

        for(Integer key:map.keySet()){
            if(queue.size()<K){
                queue.add(key);
            }
            else if(map.get(key)<map.get(queue.peek())){
                queue.poll();
                queue.add(key);
            }
        }

        int index=0;
        while(!queue.isEmpty()){
            num[index]=queue.poll();
            index++;
        }

        int[][]res=new int[K][2];
        for(int i=0;i<num.length;i++){
            res[i][0]=points[num[i]][0];
            res[i][1]=points[num[i]][1];
        }
        return res;


    }

    public static void main(String[] args) {
        int [][]points={{3,3},{5,-1},{-2,4}};
        Leet973 test=new Leet973();
        test.kClosest(points,2);
    }
}
