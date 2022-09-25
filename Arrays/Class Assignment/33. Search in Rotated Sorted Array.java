class Solution {
    public int search(int[] nums, int target) {
       int left=0,mid=0;
       int right=nums.length-1;
       while(left<=right){
           mid=(left+right)/2;
           if(nums[mid]==target){
               return mid;
           }
           //to check left side of mid is uniform or not
           else if(nums[left]<=nums[mid]){
               if(nums[left]<=target && nums[mid]>=target){
                   right=mid-1;
               }
               else{
                   left=mid+1;
               }
           }
          //to check right side of mid is uniform or not
           else{
               if(nums[mid]<=target && nums[right]>=target){
                   left=mid+1;
               }
               else{
                   right=mid-1;
               }
           }
       }
        return -1;
    }
}
