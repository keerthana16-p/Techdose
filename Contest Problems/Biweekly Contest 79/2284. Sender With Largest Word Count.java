class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map = new TreeMap<String,Integer>();
        for(int i=0;i<messages.length;i++){
             String[] str = messages[i].split(" ");
             int count=str.length;
            if(map.containsKey(senders[i])){
                map.put(senders[i],map.get(senders[i])+count);
            }
            else{
                map.put(senders[i],count);
            }
        }
        String res=" ";
        int max=Integer.MIN_VALUE;
        for(int i=0;i<senders.length;i++){
            if(map.get(senders[i])>max){
                max=map.get(senders[i]);
            }
        }
       Arrays.sort(senders);
        for(int i=0;i<senders.length;i++){
            if(map.get(senders[i])==max){
               res=senders[i];
            }
        }
        return res;
    }
}
