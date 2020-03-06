package Test_0306_1;

public class T2 {

    public int[][] updateMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][]dp=new int[row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    dp[i][j]=0;
                    continue;
                }
                if(matrix[i][j]==1){
                    dp[i][j]=row+col;
                }
                if(i>0){
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);
                }
                if(j>0){
                    dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);
                }
            }
        }

        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(i<row-1){
                    dp[i][j]=Math.min(dp[i][j],dp[i+1][j]+1);
                }
                if(j<col-1){
                    dp[i][j]=Math.min(dp[i][j],dp[i][j+1]+1);
                }

            }
        }
        return dp;

    }

//    public int jisuan(int[][]matrix,int i,int j,int count,int res){
//        if(i<0 ||i>=matrix.length || j<0 ||j>=matrix[0].length){
//            return 0;
//        }
//        if(matrix[i][j]==0){
//            if(res>count){
//                res=count;
//            }
//            return res;
//        }
//        else{
//            jisuan(matrix,i+1,j,count+1,res);
//            jisuan(matrix,i-1,j,count+1,res);
//            jisuan(matrix,i,j+1,count+1,res);
//            jisuan(matrix,i,j-1,count+1,res);
//        }
//    }
}
