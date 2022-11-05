class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,visited,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,boolean[][] visited,String word,int row,int col,int index){
        if(index==word.length()){
            return true;
        }
        if(row<0||col<0||row>=board.length||col>=board[0].length||visited[row][col]==true||board[row][col]!=word.charAt(index)){
            return false;
        }
        visited[row][col]=true;
        boolean left = dfs(board,visited,word,row,col-1,index+1);
        boolean right = dfs(board,visited,word,row,col+1,index+1);
        boolean up = dfs(board,visited,word,row-1,col,index+1);
        boolean down = dfs(board,visited,word,row+1,col,index+1);
        visited[row][col]=false;
        if(left||right||up||down){
            return true;
        }
        else{
            return false;
        }
    }
}
