import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

public class Leet451 {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Character>queue=new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return map.get(b)-map.get(a);
            }
        });

        for(Character key:map.keySet()){
            queue.add(key);
        }

        StringBuilder res=new StringBuilder("");

        while(!queue.isEmpty()){
            Character temp=queue.poll();
            for(int i=0;i<map.get(temp);i++){
                res.append(temp);
            }
        }
        return res.toString();

    }
}
