class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(total<Math.min(cost1,cost2)){
            return 1;
        }
        long ways=0;
        int min = Math.min(cost1,cost2);
        int max = Math.max(cost1,cost2);
        int rounds=0;
        while(rounds*min<=total){
            ways+=((total-(rounds*min))/max)+1;
            rounds++;
        }
        return ways;
    }
}
