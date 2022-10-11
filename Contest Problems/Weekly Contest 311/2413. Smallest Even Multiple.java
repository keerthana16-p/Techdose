class Solution {
    public int smallestEvenMultiple(int n) {
        int res=n;
        while(res%2!=0){
           res=res+n; 
        }
        return res;
    }
}
