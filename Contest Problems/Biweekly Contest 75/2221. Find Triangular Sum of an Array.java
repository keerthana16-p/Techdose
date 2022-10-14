class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1){
           return nums[0]; 
        }
        int len=nums.length;
        int[][] mat = new int[len][len];
        for(int i=0;i<len;i++){
            mat[0][i]=nums[i];
        }
        for(int i=1;i<len;i++){
            for(int j=0;j<len-i;j++){
                mat[i][j]=(mat[i-1][j]+mat[i-1][j+1])%10;
            }
        }
        return mat[len-1][0];
    }
}
