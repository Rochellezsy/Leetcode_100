public class Leet200 {
    public void bianli(char[][] grid,int r,int c){
        int row=grid.length;
        int col=grid[0].length;

        if(r<0||c<0||r>=row||c>=col||grid[r][c]=='0'){
            return;
        }

        grid[r][c]='0';
        bianli(grid,r,c-1);
        bianli(grid,r,c+1);
        bianli(grid,r-1,c);
        bianli(grid,r+1,c);
    }

    public int numIslands(char[][] grid) {
        if(grid.length==0 )return 0;
        int row=grid.length;
        int col=grid[0].length;
        int num=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    num++;
                    bianli(grid,i,j);
                }
            }
        }
        return num;

    }
}
