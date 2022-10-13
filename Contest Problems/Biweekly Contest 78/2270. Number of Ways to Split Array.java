class Solution {
     public int waysToSplitArray(int[] nums){
       long[] left = new long[nums.length];
       long[] right = new long[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+(long)nums[i];
        }
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+(long)nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(left[i]>=right[i+1]){
                count+=1;
            }
        }
        return count;
    }
}
