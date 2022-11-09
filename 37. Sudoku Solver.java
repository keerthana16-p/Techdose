class Solution {
    char[][] res;
    public void solveSudoku(char[][] board) {
        backtrack(board,0,0);
        board=res;
    }
    public boolean backtrack(char[][] board,int row,int col){
        if(col==9){
            return backtrack(board,row+1,0);
        }
        if(row==9){
            res=board;
            return true;
        }
        if(board[row][col]!='.'){
            return backtrack(board,row,col+1);
        }
        for(char i='1';i<='9';i++){
            if(!isValid(board,row,col,i)){
                continue;
            }
            board[row][col]=i;
            if(backtrack(board,row,col+1)){
                return true;
            }
            board[row][col]='.';
        }
        return false;
    }
    public boolean isValid(char[][] board,int row,int col,char ch){
        for(int i=0;i<9;i++){
            if(board[row][i]==ch){
                return false;
            }
            if(board[i][col]==ch){
                return false;
            }
            if(board[(row/3)*3+i/3][(col/3)*3+i%3]==ch){
                return false;
            }
        }
        return true;
    }
}
