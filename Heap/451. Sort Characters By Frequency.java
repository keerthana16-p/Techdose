class Solution {
    public String frequencySort(String s) {
       Map<Character,Integer> map = new HashMap<Character,Integer>();
       for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))==true){
               map.put(s.charAt(i),map.get(s.charAt(i))+1);
           }
           else{
               map.put(s.charAt(i),1);
           }
       }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(char ch : map.keySet()){
          maxHeap.add(ch);
          max.add(map.get(ch));
        }
        StringBuilder res = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char ch = maxHeap.poll();
            int len = max.poll();
            for(int i=0;i<len;i++){
                res=res.append(ch);
            }
        }
        return res.toString();
    }
}
