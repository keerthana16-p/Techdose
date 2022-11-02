class Solution {
    public int lessthanK(int mid,int m ,int n){
        int sum=0;
        for(int i=1;i<=m;i++){
            sum+=Math.min(mid/i,n);
        }
        return sum;
    }
    public int findKthNumber(int m, int n, int k) {
      int low = 1,high=m*n;
      while(low<=high){
          int mid = (low+(high-low)/2);
          if(lessthanK(mid,m,n)<k){
              low=mid+1;
          }
          else{
              high=mid-1;
          }
      }
        return low;
    }
}
