class KthLargest {
    PriorityQueue<Integer> minHeap;
    static int v;
    public  KthLargest(int k, int[] nums) {
         minHeap = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
        }
         while(minHeap.size()>k){
           minHeap.poll();  
         }
         this.v = k;
    }
    
    public int add(int val) {
        minHeap.add(val);
        while(minHeap.size()>v){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
