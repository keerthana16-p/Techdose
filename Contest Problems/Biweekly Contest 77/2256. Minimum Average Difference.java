class Solution {
    public int minimumAverageDifference(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        long[] left = new long[nums.length];
        long[] right = new long[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i];
        }
         for(int i=1;i<nums.length;i++){
            left[i]=left[i]/(i+1);
        }
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i]/(nums.length-i);
        }
        long min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            long dif ;
            if(i==nums.length-1){
                dif=Math.abs(left[i]-0);
            }
            else{
                dif = Math.abs(left[i]-right[i+1]);
            }
           if(min>dif){
               min=dif;
               index=i;
           }
        }
        return index;
    }
}
