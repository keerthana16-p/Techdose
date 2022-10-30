class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->(nums[b]-nums[a]));
        int[] res = new int[nums.length-k+1];
        int index=0;
        for(int i=0;i<nums.length;i++){
           while(!heap.isEmpty() && heap.peek()<=i-k){
               heap.poll();
           } 
            heap.add(i);
            if(i>=k-1){
                res[index++]=nums[heap.peek()];
            }
        }
        return res;
    }
}
