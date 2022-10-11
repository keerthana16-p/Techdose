class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod =(int)1e9+7;
        int minind,fromind,subarray;
        long res=0;
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for(int i=0;i<=n;i++){
            while(!deque.isEmpty() && ((i==n)?0:arr[i])<arr[deque.getLast()]){
                minind=deque.pollLast();
                fromind=(deque.isEmpty()?-1:deque.getLast());
                subarray = (minind-fromind)*(i-minind);
                res=res+((long)arr[minind]*subarray)%mod;
            }
            deque.offer(i);
        }
        return (int)(res%mod);
    }
}
