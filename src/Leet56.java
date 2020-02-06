import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leet56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        List<List<Integer>>res=new ArrayList<>();

        int index=0;
        while(index<intervals.length){
            int left=intervals[index][0];
            int right=intervals[index][1];

            while(index!=intervals.length-1 && right>=intervals[index+1][0]){
                if(right<=intervals[index+1][1]){
                    right=intervals[index+1][1];
                }
                index++;
            }
            if(index==intervals.length-1 || right<intervals[index+1][0]){
                List<Integer>list=new ArrayList<>();
                list.add(left);
                list.add(right);
                res.add(list);
                index++;
            }
        }

        int size=res.size();
        int[][]ans=new int[size][2];

        for(int i=0;i<size;i++){
            ans[i][0]=res.get(i).get(0);
            ans[i][1]=res.get(i).get(1);
        }
        return ans;


    }

    public static void main(String[] args) {
        Leet56 test=new Leet56();
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        test.merge(intervals);
    }
}
