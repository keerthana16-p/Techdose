class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negative = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative.add(nums[i]);
            }
        }
        int[] res = new int[nums.length];
        int k=0;
        for(int i=0;i<positive.size();i++){
            res[k++]=positive.get(i);
            res[k++]=negative.get(i);
        }
        return res;
    }
}
