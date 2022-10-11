class Solution {
    public int mostFrequentEven(int[] nums) {
       Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        int len = nums.length,f=0;
        for(int i=0;i<len;i++){
            if(nums[i]%2==0){
                f=1;
                if(map.containsKey(nums[i])==false){
                    map.put(nums[i],1);
                }
                else{
                    int count=map.get(nums[i]);
                    map.put(nums[i],count+1);
                }
            }
        }
        System.out.println(map);
        int maxeven=-1;
        if(f==1){
        int max=Collections.max(map.values());
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue()==max){
               maxeven=entry.getKey();
               break;
           }
       }
        }
        return maxeven;
    }
}
