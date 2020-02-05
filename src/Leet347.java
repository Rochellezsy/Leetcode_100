import java.util.*;

public class Leet347 {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a)-map.get(b);
            }
        });

        for(Integer key:map.keySet()){

            if(queue.size()<k){
                queue.add(key);
            }
            else {
                if(map.get(key)>queue.peek()){
                    queue.remove(queue.peek());
                    queue.add(key);
                }
            }
        }

        List<Integer>res=new ArrayList<>();
        while(!queue.isEmpty()){
            res.add(queue.poll());
        }

        return res;


    }
}
