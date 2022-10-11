class Solution {
    public static int maximum(int[][] grid,int sRow,int sCol){
        int max=grid[sRow][sCol];
        for(int i=sRow;i<=sRow+2;i++){
            for(int j=sCol;j<=sCol+2;j++){
                if(grid[i][j]>max){
                    max=grid[i][j];
                }
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int[][] res = new int[rowLen-2][colLen-2];
        for(int i=0;i<rowLen-2;i++){
            for(int j=0;j<colLen-2;j++){
                res[i][j]=maximum(grid,i,j);
            }
        }
        return res;
    }
}
