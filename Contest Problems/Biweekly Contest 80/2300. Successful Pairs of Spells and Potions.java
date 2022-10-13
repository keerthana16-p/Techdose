class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        int index=-1;
        for(int i=0;i<spells.length;i++){
            int low=0,high=potions.length-1,mid=0;
            index=-1;
            while(low<=high){
                mid=low+(high-low)/2;
                if((long)(spells[i]*potions[mid])>=success){
                    index=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            res[i]=index==-1?0:potions.length-index;
        }
        return res;
    }
}
