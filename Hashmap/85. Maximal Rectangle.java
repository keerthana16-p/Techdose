class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxArea=0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dp = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dp[j]=matrix[i][j]=='1'?dp[j]+1:0;
            }
            maxArea=Math.max(maxArea,findMax(dp));
        }
        return maxArea;
    }
    public int findMax(int[] heights){
        int max=0;
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<heights.length;i++){
            if(stack.empty()==true){
                left[i]=0;
                stack.push(0);
            }
            else{
              while(!stack.empty() && heights[stack.peek()]>=heights[i])                {
                stack.pop();
              }
            left[i]=stack.empty()==true?0:stack.peek()+1;
            stack.push(i);
            }
        }
        while(stack.empty()==false){
            stack.pop();
        }
      for(int i=heights.length-1;i>=0;i--){
          if(stack.empty()==true){
              right[i]=heights.length-1;
              stack.push(heights.length-1);
          }
          else{
              while(!stack.empty() && heights[stack.peek()]>=heights[i]){
                  stack.pop();
              }
              right[i]=stack.empty()==true?heights.length-1:stack.peek()-1;
              stack.push(i);
          }
      }
        for(int i=0;i<heights.length;i++){
            int area = heights[i]*(right[i]-left[i]+1);
            if(max<area){
                max=area;
            }
        }
        return max;
    }
}
