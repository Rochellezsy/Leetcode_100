import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Newcoder_2 {

    public void digui(int [][]arr, int k,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> res){
        int ans;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                if(!list.contains(k)){
                    list.add(k);
                    k=j==0?arr[i][1]:arr[i][0];
                    digui(arr,k,list,res);
                }
                else {
                    res.add(list);
                }
            }
        }
    }


    public void show(ArrayList<ArrayList<Integer>> res){

        for (ArrayList<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Newcoder_2 test=new Newcoder_2();

        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[][]=new int[n-1][2];
        if(n==0) return;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=in.nextInt();
            }
        }
        test.digui(arr,k,list,res);
        test.show(res);



//        test.digui(arr,k,list,res);
//        test.show(res);





    }


}
