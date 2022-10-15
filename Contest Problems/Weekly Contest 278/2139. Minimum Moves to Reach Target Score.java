class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        if(maxDoubles==0){
            return target-1;
        }
        while(target!=1){
            if(target%2==0 && maxDoubles>0){
                target=target/2;
                maxDoubles--;
                count++;
            }
            else if(target>1 && maxDoubles==0){
                count+=(target-1);
                target=1;
            }
            else{
                target--;
                count++;
            }
        }
        return count;
    }
}
