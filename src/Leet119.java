import java.util.ArrayList;
import java.util.List;

public class Leet119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        return digui(1,list,rowIndex+1);
    }
    public List<Integer> digui(int index, List<Integer>list, int rowIndex){
        if(index==rowIndex){
            return list;
        }
        else {
            List<Integer>templist=new ArrayList<>();
            int size=list.size();
            templist.add(list.get(0));
            for(int i=0;i<size-1;i++){
                templist.add(list.get(i)+list.get(i+1));
            }
            templist.add(1);
            return digui(index+1,templist,rowIndex);
        }
    }
}
