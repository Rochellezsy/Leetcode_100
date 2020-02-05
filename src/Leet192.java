import java.util.Comparator;
import java.util.PriorityQueue;

public class Leet192 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a-b;
            }
        });

        for(Integer num:nums){
            if(queue.size()<k){
                queue.add(num);
            }
            else if(num>queue.peek()){
                queue.poll();
                queue.add(num);
            }
        }

        return queue.poll();

    }
}
