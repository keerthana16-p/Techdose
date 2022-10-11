class Solution { 

    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++){
           int sum=0,right=0;
            while(right<nums.length && sum+nums[right]<=queries[i]){
                sum=sum+nums[right];
                right++;
            }
            res[i]=right;
        }
        return res;
    }
}
