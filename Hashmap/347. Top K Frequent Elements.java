class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            if(map.containsKey(val)==true){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        List<Integer>[] bucket = new List[nums.length+1];
        for(int val:map.keySet()){
            if(bucket[map.get(val)]==null){
                bucket[map.get(val)]=new ArrayList();
            }
            bucket[map.get(val)].add(val);
        }
        for(int i=bucket.length-1;i>=0 && list.size()<k ;i--){
            if(bucket[i]!=null){
                list.addAll(bucket[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
