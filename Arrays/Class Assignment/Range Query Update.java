class NumArray {
    private int nums[];
    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        this.nums=nums;
    }
    
    public void update(int index, int value) {
        int val=0;
        if(index!=0){
           val= nums[index]-nums[index-1];
        }
        else{
           val= nums[index];
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=(nums[i]-val)+value;
        }
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

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
