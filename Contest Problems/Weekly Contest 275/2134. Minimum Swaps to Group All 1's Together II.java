class Solution {
    public int minSwaps(int[] nums) {
        int len = nums.length;
        int total = 0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                total+=1;
            }
        }
        if(total==len || total==0){
            return 0;
        }
        int i=0,count=0,k=0,min=Integer.MAX_VALUE;
        // first sliding of fixed size (total number of ones)
        while(k<total){
            if(nums[k]==0){
                count+=1;
            }
            k++;
        }
        min=Math.min(count,min);
        i++;
        while(i<len){
            int j=(i+total-1)%len;//next element that is newly entering into the window
            if(nums[j]==0 && nums[i-1]==1){
                count++;
            }
            if(nums[j]==1 && nums[i-1]==0){
                count--;
            }
            min=Math.min(count,min);
            i++;
        }
        return min;
    }
}
