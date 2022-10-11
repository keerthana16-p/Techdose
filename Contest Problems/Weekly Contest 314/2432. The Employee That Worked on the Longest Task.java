class Solution {
    public int hardestWorker(int n, int[][] logs) {
        List<Integer> time = new ArrayList<Integer>();
        for(int i=0;i<logs.length;i++){
            if(i==0){
                time.add(logs[i][1]);
            }
            else{
                time.add(logs[i][1]-logs[i-1][1]);
            }
        }
        int max = Collections.max(time);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<logs.length;i++){
            if(time.get(i)==max){
                min=Math.min(min,logs[i][0]);
            }
        }
        return min;
    }
}
