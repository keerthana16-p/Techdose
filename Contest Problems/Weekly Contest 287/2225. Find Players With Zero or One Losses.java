class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> win = new HashMap<Integer,Integer>();
        Map<Integer,Integer> loss = new HashMap<Integer,Integer>();
        for(int i=0;i<matches.length;i++){
            if(win.containsKey(matches[i][0])==false){
                win.put(matches[i][0],1);
            }
            else{
                win.put(matches[i][0],(win.get(matches[i][0]))+1);
            }
            if(loss.containsKey(matches[i][1])==false){
               loss.put(matches[i][1],1); 
            }
            else{
                loss.put(matches[i][1],(loss.get(matches[i][1]))+1);
            }
        }
       List<Integer> noLoss = new ArrayList<Integer>();
       List<Integer> oneLoss = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> entry:win.entrySet()){
           int key = entry.getKey();
           if(loss.containsKey(key)==true && loss.get(key)==0){
               noLoss.add(key);
           }
           else if(loss.containsKey(key)==false){
               noLoss.add(key);
           }
           if(loss.containsKey(key)==true && loss.get(key)==1){
               oneLoss.add(entry.getKey());
               loss.put(key,0);
           } 
        }
        for(Map.Entry<Integer,Integer> entry:loss.entrySet()){
            if(entry.getValue()==1){
                oneLoss.add(entry.getKey());
            }
        }
        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        list.add(noLoss);
        list.add(oneLoss);
        return list;
    }
}
