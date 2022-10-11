class Solution {
    public int[] numberOfPairs(int[] nums) {
       int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==true){
                map.put(nums[i],(map.get(nums[i])+1));
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=0){
                int val=map.get(nums[i])/2;
                res[0]=res[0]+val;
                map.put(nums[i],(map.get(nums[i])-(val*2)));
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=0){
                res[1]=res[1]+map.get(nums[i]);
                map.put(nums[i],0);
            }
        }
        return res;
    }
}
