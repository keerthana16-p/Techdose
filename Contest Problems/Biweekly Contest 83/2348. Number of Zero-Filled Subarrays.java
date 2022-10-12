class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        int right=0;
        while(right<nums.length){
            int c=0;
            if(nums[right]==0){
                while(right<nums.length && nums[right]==0){
                    c+=1;
                    right++;
                }
                count+=((long)c*((long)(c+1)))/2;
            }
            right++;
        }
        return count;
    }
}
