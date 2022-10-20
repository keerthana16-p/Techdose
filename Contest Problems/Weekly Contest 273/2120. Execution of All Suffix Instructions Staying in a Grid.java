class Solution {
    public int[] executeInstructions(int n, int[] startpos, String s) {
        int len = s.length();
        int[] arr = new int[len];
        int i=startpos[0];
        int j=startpos[1];
        for(int k=0;k<len;k++){
            int count=0,m=k;
            i=startpos[0];
            j=startpos[1];
            while(m<len){
                if(s.charAt(m)=='R'){
                    j=j+1;
                }
                else if(s.charAt(m)=='L'){
                    j=j-1;
                }
                else if(s.charAt(m)=='U'){
                    i=i-1;
                }
                else if(s.charAt(m)=='D'){
                    i=i+1;
                }
                if(i>=0 && j>=0 && i<n && j<n){
                    count++;
                }
                else{
                    break;
                }
                m++;
            }
            arr[k]=count;
        }
        return arr;
    }
}
