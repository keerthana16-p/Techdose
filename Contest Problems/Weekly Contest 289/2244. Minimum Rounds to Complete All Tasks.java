class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<tasks.length;i++){
            if(map.containsKey(tasks[i])==true){
                map.put(tasks[i],map.get(tasks[i])+1);
            }
            else{
                map.put(tasks[i],1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return -1;
            }
            else if(entry.getValue()<=3){
                count++;
            }
            else{
                if(entry.getValue()%3==0){
                    count+=entry.getValue()/3;
                }
                else{
                    count+=(entry.getValue()/3)+1;
                }
            }
        }
        return count;
    }
}
