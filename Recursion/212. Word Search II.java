class Solution {
    class TrieNode{
        TrieNode[] next = new TrieNode[26];
        String word;
    }
    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for(String w:words){
            TrieNode temp =root;
            for(char ch:w.toCharArray()){
                int pos = ch-'a';
                if(temp.next[pos]==null){
                    temp.next[pos]=new TrieNode();
                }
                temp=temp.next[pos];
            }
            temp.word=w;
        }
        return root;
    }
    public List<String> findWords(char[][] board, String[] words) {
      List<String> res = new ArrayList<>();
      TrieNode root = buildTrie(words);
      for(int i=0;i<board.length;i++){
          for(int j=0;j<board[0].length;j++){
              dfs(board,root,i,j,res);
          }
      }
      return res;
    }
    public void dfs(char[][] board,TrieNode root,int row,int col,List<String> res){
        char ch = board[row][col];
        if(ch=='#' || root.next[ch-'a']==null){
            return;
        }
        root=root.next[ch-'a'];
        if(root.word!=null){
            res.add(root.word);
            root.word=null;
        }
        board[row][col]='#';
        if(row>0){
            dfs(board,root,row-1,col,res);
        }
        if(col>0){
            dfs(board,root,row,col-1,res);
        }
        if(row<board.length-1){
            dfs(board,root,row+1,col,res);
        }
        if(col<board[0].length-1){
            dfs(board,root,row,col+1,res);
        }
        board[row][col]=ch;
    }
}
