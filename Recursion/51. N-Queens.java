class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        QueenTry(board,res,0);
        return res;
    }
    public void QueenTry(char[][] board,List<List<String>> res,int row){
        if(row==board.length){
            res.add(build(board));
            return ;
        }
        for(int i=0;i<board[0].length;i++){
            if(Validate(board,row,i,board.length)){
                board[row][i]='Q';
                QueenTry(board,res,row+1);
                board[row][i]='.';
            }
        }
    }
    public boolean Validate(char[][] board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
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
    public List<String> build(char[][] board){
        List<String> list = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            list.add(new String(board[i]));
        }
        return list;
    }
}
