import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public int average(List<Integer> list){
        int n=list.size();
        int ans=0;
        int result;
        for(int i=0;i<n;i++){
            ans=ans+list.get(i);
        }
        result=ans/n;
        return result;
    }
    public void record(int num, List<List<Integer>> res,List<Integer>list){
        System.out.println("record("+num+") is called");
        Date date = new Date();
        list.add(num);
//        list.add(date.now);
        res.add(new ArrayList<>(list));
    }



    public boolean judge(int start,int end){
        if(end-start>300){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Solution test=new Solution();
        Solutioninfo tt=new Solutioninfo();
        List<Integer> list=new ArrayList<>();
        tt.setNum(10);
        tt.setTime(0);


        //时间的判断
        if(test.judge(0,10)){
            test.average(list);
        }
        else {
            System.out.println("-1");
        }




//        test.record(10,list);
//        test.record(15,list);
//        test.record(5,list);
//        test.record(20,list);
        int average = test.average(list);

    }





}
