class Solution {
    public int[] decode(int[] encoded) {
        int total = 0;
        int n = encoded.length+1;
        for(int i=1;i<=n;i++){
            total^=i;
        }
        int val=0;
        for(int i=1;i<n;i=i+2){
            val^=encoded[i];
        }
        int first = total^val;
        int[] res = new int[n];
        res[0]=first;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]^encoded[i-1];
        }
        return res;
    }
}
