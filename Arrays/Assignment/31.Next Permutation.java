class Solution {
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int lastind=-1,i=1;
        //To find the peek element
        while(i<len){
            if(nums[i]>nums[i-1]){
                lastind=i;
            }
            i++;
        }
        //if the sequence is in desending order
        if(lastind==-1){
            for(i=0;i<len/2;i++){
                swap(nums,i,len-i-1);
            }
            return;
        }
//to check the values present after the peek contains any value within the range of element present before peek and peek
        int peek=nums[lastind];
        int index=lastind;
        for(i=lastind;i<len;i++){
            if(nums[lastind-1]<nums[i] && nums[i]<nums[lastind]){
                index=i;
            }
        }
        swap(nums,index,lastind-1);
        Arrays.sort(nums,lastind,len);
    }
}
