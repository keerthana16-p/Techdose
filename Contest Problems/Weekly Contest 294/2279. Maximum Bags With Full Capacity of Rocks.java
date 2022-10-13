class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<capacity.length;i++){
            list.add(capacity[i]-rocks[i]);
        }
        Collections.sort(list);
        int count=0,i=0;
        while(i<list.size()){
            if(list.get(i)==0){
                list.remove(list.get(i));
                count+=1;
            }
            i++;
        }
        i=0;
        while(additionalRocks>0 && i<list.size()){
            additionalRocks-=list.get(i);
            i++;
            if(additionalRocks>=0){
              count++;
            }
        }
      return count;  
    }
}
