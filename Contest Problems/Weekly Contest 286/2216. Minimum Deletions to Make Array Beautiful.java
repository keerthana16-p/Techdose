class Solution {
    public int minDeletion(int[] nums) {
        int n = nums.length;
        int i=0,res=0;
        while(i<n && (i+1)<n){
            if(nums[i]!=nums[i+1]){
                i=i+2;
            }
            else{
                i++;
                res++;
            }
        }
        if((n-res)%2==0){
            return res;
        }
        return res+1;
    }
}
