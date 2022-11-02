class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                minheap.add(matrix[i][j]);
            }
        }
        int count=0;
        while(count<k-1){
            minheap.poll();
            count++;
        }
        System.out.println(minheap);
        return minheap.peek();
    }
}
