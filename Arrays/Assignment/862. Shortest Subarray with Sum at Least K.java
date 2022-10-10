class Solution {
    public int shortestSubarray(int[] nums, int k) {
      long[] sum = new long[nums.length+1];
      for(int i=0;i<nums.length;i++){
          sum[i+1]=sum[i]+nums[i];
      }
     Deque<Integer> deque = new ArrayDeque<Integer>();
     int min = nums.length+1;
     for(int i=0;i<nums.length+1;i++){
         while(deque.size()>0 && sum[i]-sum[deque.getFirst()]>=k){
             min = Math.min(min,i-deque.pollFirst());
         }
         while(deque.size()>0 && sum[i]<sum[deque.getLast()]){
             deque.pollLast();
         }
         deque.add(i);
     }
        return (min==nums.length+1)?-1:min;
    }
}
