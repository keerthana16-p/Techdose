class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        if(nums.length<4){
            return list;
        }
        for(int i=0;i<=nums.length-4;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<=nums.length-3;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1,right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> l=new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[left]);
                        l.add(nums[right]);
                        if(!list.contains(l)){
                            list.add(l);
                        }
                        left++;
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
