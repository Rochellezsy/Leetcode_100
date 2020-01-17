import java.util.ArrayList;
import java.util.List;

public class Leet118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0) return new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        list.add(1);
        res.add(list);

        for(int i=1;i<numRows;i++){
            int size=res.get(i-1).size();
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            for(int j=0;j<size-1;j++){
                int p=res.get(i-1).get(j)+res.get(i-1).get(j+1);
                temp.add(p);
            }
            temp.add(1);
            res.add(temp);
        }
        return res;

    }
}
