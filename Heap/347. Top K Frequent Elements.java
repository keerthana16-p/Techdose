class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])==true){
              map.put(nums[i],map.get(nums[i])+1);
          }
          else{
              map.put(nums[i],1);
          }
      }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
       for(int key:map.keySet()){
           maxHeap.add(key);
       }
      int[] res = new int[k]; 
      int index=0;
      for(int i=0;i<k;i++){
          res[index++]=maxHeap.poll();
      }   
      return res;                                                   
    }
}
