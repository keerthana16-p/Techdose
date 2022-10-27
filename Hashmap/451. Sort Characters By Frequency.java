class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)==true){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
       List<Character>[] bucket = new List[s.length()+1];
        for(char ch:map.keySet()){
            int frequency = map.get(ch);
            if(bucket[frequency]==null){
                 bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(ch);
        }
        StringBuilder str = new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char ch:bucket[i]){
                    for(int j=0;j<i;j++){
                        str.append(ch);
                    }
                }
            }
        }
        return str.toString();
    }
}
