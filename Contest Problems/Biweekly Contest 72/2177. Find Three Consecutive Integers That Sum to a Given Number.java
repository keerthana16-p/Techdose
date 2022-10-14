class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
       long[] res = new long[3];
       long val = (num/3)-1;
       res[0]=val;
       res[1]=val+1;
       res[2]=val+2;
        return res;
    }
}
