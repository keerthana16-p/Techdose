class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = new int[len*2];
        int k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<len;j++){
               res[k++]=nums[j]; 
            }
        }
        return res;
    }
}
