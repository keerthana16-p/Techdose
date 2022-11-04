class Solution {
    int count = 0;
    public int totalNQueens(int n) {
       char[][] board = new char[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               board[i][j]='.';
           }
       } 
       QueenTry(board,0);
       return count;
    }
    public void QueenTry(char[][] board,int row){
        if(row==board.length){
            count+=1;
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(validate(board,row,i,board.length)){
                board[row][i]='Q';
                QueenTry(board,row+1);
                board[row][i]='.';
            }
        }
    }
    public boolean validate(char[][] board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
