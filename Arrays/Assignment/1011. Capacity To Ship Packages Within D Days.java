class Solution {
    public static boolean Possible(int[] weights,int mid,int days){
        int len = weights.length;
        int sum=0,d=1;
        for(int i=0;i<len;i++){
            if(sum+weights[i]<=mid){
                sum=sum+weights[i];
            }
            else{
                sum=weights[i];
                d++;
            }
        }
        if(d<=days){
            return true;
        }
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
            sum=sum+weights[i];
        }
        int low = max;
        int high = sum;
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(Possible(weights,mid,days)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
