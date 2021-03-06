import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    HashMap<Integer,Integer>map;
    LinkedList<Integer>list;
    int size;

    public LRUCache(int capacity) {
        map=new HashMap<>();
        list=new LinkedList<>();
        this.size=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            list.remove((Integer) key);
            list.add(key);

            return map.get(key);
        }
        else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(!map.containsKey(key)){
            if(map.size()==size){
                map.remove(list.pollFirst());
            }
        }else {
            list.remove((Integer) key);
        }
        map.put(key,value);
        list.add(key);
    }
}
