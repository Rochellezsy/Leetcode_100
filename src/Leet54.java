import java.util.ArrayList;
import java.util.List;

public class Leet54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        if(matrix.length==0)return list;
        int row=matrix.length-1;
        int col=matrix[0].length-1;

        int up=0;
        int down=row;
        int left=0;
        int right=col;

        while(up<=down && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[up][i]);
            }
            up++;
            if(up>down){
                break;
            }
            for(int i=up;i<=down;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(left>right){
                break;
            }
            for(int i=right;i>=left;i--){
                list.add(matrix[down][i]);
            }
            down--;
            if(up>down){
                break;
            }
            for(int i=down;i>=up;i--){
                list.add(matrix[i][left]);
            }
            left++;
            if(left>right){
                break;
            }
        }
        return list;

    }
}
