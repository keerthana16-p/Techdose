class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] res = new int[nums.length];
        long[] sum= new long[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=-1;
        }
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+(long)nums[i];
        }
        for(int i=k;i<nums.length-k;i++){
            int start=i-k;
            int end=i+k;
            int divide = (2*k)+1;
            long s=0;
            if(start==0){
                s=sum[end];
            }
            else{
                s=sum[end]-sum[start-1];
            }
            res[i]=(int)(s/divide);
        }
        return res;
    }
}
