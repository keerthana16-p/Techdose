class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long res=0,min=0,max=0;
        for(int dif : differences){
            res+=dif;
            max=Math.max(max,res);
            min=Math.min(min,res);
        }
        return (int)Math.max(0,(upper-lower)-(max-min)+1);
    }
}
