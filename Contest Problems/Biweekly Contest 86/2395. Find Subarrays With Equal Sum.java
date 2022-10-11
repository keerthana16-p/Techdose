class Solution {
    public boolean findSubarrays(int[] nums) {
        int n= nums.length;
        int sum=0;
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            sum=nums[i]+nums[i+1];
            for(int j=i+1;j<n-1;j++){
               if(nums[j]+nums[j+1]==sum){
                   flag=true;
               }
            }
        }
        return flag;
    }
}
