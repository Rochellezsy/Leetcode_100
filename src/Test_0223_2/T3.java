package Test_0223_2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T3 {
    public int[][] kClosest(int[][] points, int K) {
        int[][]res=new int[K][2];
        PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[1]*b[1]+b[0]*b[0]-a[1]*a[1]+a[0]*a[0];
            }

        });
        for(int i=0;i<points.length;i++){
            if(queue.size()<K){
                int[]temp=new int[3];
                int sum=points[i][0]*points[i][0]+points[i][1]*points[i][1];
                temp[0]=points[i][0];
                temp[1]=points[i][1];
                temp[2]=sum;
                queue.add(temp);
            }
            else {
                int[]temp=queue.peek();
                if(points[i][0]*points[i][0]+points[i][1]*points[i][1]<temp[2]){
                    queue.poll();
                    int[]temp2=new int[3];
                    int sum=points[i][0]*points[i][0]+points[i][1]*points[i][1];
                    temp2[0]=points[i][0];
                    temp2[1]=points[i][1];
                    temp2[2]=sum;
                    queue.add(temp2);
                }
            }
        }

        for(int i=0;i<K;i++){
            int[]x=queue.poll();
            res[i][0]=x[0];
            res[i][1]=x[1];
        }
        return res;
    }

    public static void main(String[] args) {
        T3 test=new T3();
        int[][]points={{5,-4},{6,-5},{4,6}};
        int[][]ans=test.kClosest(points,2);
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
