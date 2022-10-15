class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int[] left = new int[nums.length+1];
        int[] right = new int[nums.length+1];
        int[] res = new int[nums.length+1];
        int max=Integer.MIN_VALUE;
        left[0]=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                left[i+1]=left[i]+1;
            }
            else{
                left[i+1]=left[i];
            }
        }
        right[right.length-1]=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==1){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=right[i+1];
            }
        }
        for(int i=0;i<left.length;i++){
            res[i]=left[i]+right[i];
            if(res[i]>max){
                max=res[i];
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==max){
                list.add(i);
            }
        }
        return list;
    }
}
