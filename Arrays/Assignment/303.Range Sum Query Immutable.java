//Brute Force
class NumArray {

    private int nums[];
    public NumArray(int[] nums) {
      this.nums=nums;//To assign the values that passed to the constructor to the array present in the class
    }    
    public int sumRange(int left, int right) {        
        int sum=0;
        for(int i=left;i<=right;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}
//Prefix Sum 
class NumArray {

    private int nums[];
    public NumArray(int[] nums) {
      for(int i=1;i<nums.length;i++){
          nums[i]=nums[i]+nums[i-1];//to find the prefix sum 
      }
      this.nums=nums;
    }    
    public int sumRange(int left, int right) {        
        int sum=0;
        if(left!=0){
           sum=nums[right]-nums[left-1];
        }
        else{
            sum=nums[right];
        }
        return sum;
    }
}
