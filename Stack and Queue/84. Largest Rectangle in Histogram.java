class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stack = new Stack<Integer>();
        int n = heights.length;
        for(int i=0;i<n;i++){
            if(stack.empty()){
                left[0]=0;
                stack.push(0);
            }
            else{
                while(!stack.empty() && heights[stack.peek()]>=heights[i]){
                    stack.pop();
                }
                left[i]=stack.empty()?0:stack.peek()+1;
                stack.push(i);
            }
        }
        while(!stack.empty()){
            stack.pop();
        }
        for(int i=n-1;i>=0;i--){
            if(stack.empty()){
                right[n-1]=n-1;
                stack.push(n-1);
            }
            else{
                while(!stack.empty() && heights[stack.peek()]>=heights[i]){
                    stack.pop();
                }
                right[i]=stack.empty()?n-1:stack.peek()-1;
                stack.push(i);
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area = heights[i]*(right[i]-left[i]+1);
            if(max<area){
                max=area;
            }
        }
        return max;
    }
}
