class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0,row=grid.length,col=grid[0].length,res=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        while(fresh>0){
            int temp=fresh;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(grid[i][j]==2){
                        if(j+1<col && grid[i][j+1]==1){
                            fresh--;
                            grid[i][j+1]=3;
                        }
                        if(j-1>=0 && grid[i][j-1]==1){
                            fresh--;
                            grid[i][j-1]=3;
                        }
                        if(i+1<row && grid[i+1][j]==1){
                            fresh--;
                            grid[i+1][j]=3;
                        }
                        if(i-1>=0 && grid[i-1][j]==1){
                            fresh--;
                            grid[i-1][j]=3;
                        }
                    }
                }
            }
                if(temp==fresh){
                        return -1;
                    }
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            if(grid[i][j]==3){
                                grid[i][j]=2;
                            }
                        }
                    }
               res+=1;
             }
        return res;
    }
}
