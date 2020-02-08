import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Leet381 {
    HashMap<Integer,Integer>map;
    List<Integer> list;

    /** Initialize your data structure here. */
    public Leet381() {
        map=new HashMap<>();
        list=new ArrayList<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val,list.size());
            list.add(val);
            return true;
        }
        else {
            return false;
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        else {
            if(list.size()>1){
                int index=map.get(val);
                map.remove(val,index);
                map.put(list.get(list.size()-1),index);
                list.set(index,list.get(list.size()-1));
                list.remove(list.get(list.size())-1);
            }
            else {
                list.remove(0);
                map.remove(val,0);
            }
            return true;
        }

    }

    /** Get a random element from the collection. */
    public int getRandom() {
        int len=map.size();
        Random random=new Random();
        int indexrandom=random.nextInt(len);
        return list.get(indexrandom);
    }
}
