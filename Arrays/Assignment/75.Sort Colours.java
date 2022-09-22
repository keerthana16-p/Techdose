//Using Selection Sort
class Solution {
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int len = nums.length;
        int minind=0;
        for(int i=0;i<len-1;i++){
            minind=i;
            for(int j=i+1;j<len;j++){
                if(nums[minind]>nums[j]){
                    minind=j;
                }
            }
            swap(nums,i,minind);
        }
    }
}
