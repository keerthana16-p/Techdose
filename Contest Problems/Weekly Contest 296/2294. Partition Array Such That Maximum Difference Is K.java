class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int prev=0,count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-nums[prev]<=k){
                continue;
            }
            count++;
            prev=i;
        }
        return count;
    }
}
