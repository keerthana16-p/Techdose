//Smallest size subarray with sum>=target
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum=0,left=0,right=0;
        while(right<nums.length){
        sum=sum+nums[right];
        if(sum>=target){
            while(sum>=target){
            sum=sum-nums[left];
            left++;
            }
           if(min>((right-left)+2)){
            min=((right-left)+2);
           }
         }
              right++;
       }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
