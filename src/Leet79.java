public class Leet79 {
    public boolean back(char[][]board,String word,boolean[][]flag,int r,int c){
        int row=board.length;
        int col=board[0].length;
        if(word.length()==0){
            return true;
        }
        if(r<0||r>=row||c<0||c>=col||flag[r][c]==true||board[r][c]!=word.charAt(0)){
            return false;
        }
        flag[r][c]=true;
        boolean res=back(board,word.substring(1),flag,r+1,c)||back(board,word.substring(1),flag,r-1,c)||back(board,word.substring(1),flag,r,c+1)||back(board,word.substring(1),flag,r,c-1);
        if(!res){
            flag[r][c]=false;
        }
        return res;
    }


    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] flag=new boolean[row][col];
                    if(back(board,word,flag,i,j)){
                        return true;
                    }
                    else {
                        flag[i][j]=false;
                    }
                }
            }
        }
        return false;
    }
}
