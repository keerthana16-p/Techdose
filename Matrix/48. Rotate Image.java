class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length,col=matrix[0].length;
        //Transpose of the given matrix
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int n=col%2==0?col/2:(col/2)+1;
        //Reverse the row in the transposed matrix
        for(int i=0;i<row;i++){
            int j=0;
            while(j<n){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][col-j-1];
                matrix[i][col-j-1]=temp;
                j++;
            }
        }
    }
}
