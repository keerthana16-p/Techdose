class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int N=nums.length;
        if(N<3){
            return list;
        }
        for(int i=0;i<=N-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1,right=N-1;
            int sum=0-nums[i];
            while(left<right){
                if(sum==nums[left]+nums[right]){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    list.add(l);
                    
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]<sum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
}
