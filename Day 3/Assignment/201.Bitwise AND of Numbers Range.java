class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        /*int res=left;
        for(int i=left+1;i<=right;i++){
            res=res&i;
        }
        return res;
        *cannot applied for big values*/
        int res=0,count=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            count++;
        }
        res=left;
        return res<<count;
    }
}
