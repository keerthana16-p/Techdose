class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int f=0;
        for(int i=0;i<suits.length-1;i++){
            if(suits[i]!=suits[i+1]){
                f=1;
            }
        }
        if(f==0){
            return "Flush";
        }
        for(int i=0;i<ranks.length;i++){
            int c=1;
           for(int j=i+1;j<ranks.length;j++){
               if(ranks[i]==ranks[j]){
                   c=c+1;
               }
           }
            if(c>=3){
                return "Three of a Kind";
            }
        }
        for(int i=0;i<suits.length;i++){
            for(int j=i+1;j<suits.length;j++){
                if(ranks[i]==ranks[j]){
                    return "Pair";
                }
            }
        }
        return "High Card";
    }
}
