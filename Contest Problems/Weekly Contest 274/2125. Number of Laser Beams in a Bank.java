class Solution {
    public int numberOfBeams(String[] bank) {
        int len = bank.length;
        int[] arr = new int[len];
        int count=0;
        for(int i=0;i<len;i++){
            int n=bank[i].length(),c=0,j=0;
            while(j<n){
                if(bank[i].charAt(j)=='1'){
                    c=c+1;
                }
                j++;
            }
            arr[i]=c;
        }
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                for(int j=i+1;j<len;j++){
                    if(arr[j]!=0){
                        count+=(arr[i]*arr[j]);
                        break;
                    }
                }
            }
        }
        return count;
    }
}
