class Solution {
    public boolean isValidSudoku(char[][] board) {
         Set<String> set = new HashSet<>();
         for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 if(board[i][j]!='.'){
                     char ch= board[i][j];
                     if(set.contains(ch+"r"+i)||set.contains(ch+"c"+j)||set.contains(ch+"b"+i/3+j/3)){
                           return false;       
                     }
                     set.add(ch+"r"+i);
                     set.add(ch+"c"+j);
                     set.add(ch+"b"+i/3+j/3);
                 }
             }
         }
        return true;
    }
}
