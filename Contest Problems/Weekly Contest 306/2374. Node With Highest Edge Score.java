class Solution {
    public int edgeScore(int[] edges) {
        long[] sum= new long[edges.length];
        for(int i=0;i<edges.length;i++){
            sum[edges[i]]+=i;
        }
        long max=sum[0];
        int index=0;
        for(int i=0;i<edges.length;i++){
            if(max<sum[i]){
                max=sum[i];
                index=i;
            }
        }
        return index;
    }
}
