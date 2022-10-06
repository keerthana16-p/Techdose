class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int right=0,index=0;
        while(right<nums.length){
            if(!deque.isEmpty() && right-k==deque.getFirst()){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[right]>nums[deque.getLast()]){
                deque.removeLast();
            }
            deque.add(right);
            if(right>=k-1){
                res[index++]=nums[deque.getFirst()];
            }
            right++;
        }
        return res;
    }
}
