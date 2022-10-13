class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                min=Math.min(min,(i-map.get(cards[i]))+1);
                map.put(cards[i],i);
            }
            else{
                map.put(cards[i],i);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
