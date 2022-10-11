class Solution {
    public static int consecutive(String blocks,int len,int start,int k){
        int count=0,oper=0;
        for(int i=start;i<len;i++){
            if(blocks.charAt(i)=='B'){
                   count+=1;
            }
            else if(blocks.charAt(i)=='W' && count<k){
                oper+=1;
                count+=1;
            }
            if(count==k){
                return oper;
            }
        }
        return 0;
    }
    public int minimumRecolors(String blocks, int k) {
        int count =0;
        int len = blocks.length();
        int f=0,min=100;
        for(int i=0;i<len;i++){
            while(i<len && blocks.charAt(i)=='B' ){
                count+=1;
                i++;
            }
            if(count>=k){
                min=0;
                f=1;
            }
            else{
                count=0;
            }
        }
        if(f==0){
        for(int i=0;i<len;i++){
            if(consecutive(blocks,len,i,k)!=0){
               count=consecutive(blocks,len,i,k);
            }
            if(min>count){
                min=count;
            }
        }
        }
        return min;
    }
}
