class Solution {
    public long countBadPairs(int[] nums) {
        long res=0;//to store the count of good pairs
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(i-nums[i])){
                map.put((i-nums[i]),map.get((i-nums[i]))+1);
            }
            else{
                map.put((i-nums[i]),1);
            }
            res+=map.get(i-nums[i]);
        }
        return ((long)nums.length*((long)nums.length+1))/2 - res;
        // ((long)nums.length*((long)nums.length+1))/2  =>total number of possible pairs
    }
}
