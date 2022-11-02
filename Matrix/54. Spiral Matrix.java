class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length,col=matrix[0].length;
        int sr=0,sc=0,er=row-1,ec=col-1;
        List<Integer> list = new ArrayList<Integer>();
        while(sr<=er && sc<=ec){
            for(int i=sc;i<col && i<=ec;i++){
                list.add(matrix[sr][i]);
            }
            for(int i=sr+1;i<row && i<=er;i++){
                 list.add(matrix[i][ec]);
            }
            if(!(sr<er && sc<ec)){
                break;
            }
            for(int i=ec-1;i>=0 && i>sc;i--){
                list.add(matrix[er][i]);
            }
            for(int i=er;i>=0 && i>sr;i--){
                list.add(matrix[i][sc]);
            }
            sr+=1;
            sc+=1;
            er-=1;
            ec-=1;
        }
        return list;
    }
}
