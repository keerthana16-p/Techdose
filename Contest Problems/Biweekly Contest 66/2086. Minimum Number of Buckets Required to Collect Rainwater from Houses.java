class Solution {
    public int minimumBuckets(String street) {
       int buckets=0;
       int len = street.length();
        for(int i=0;i<len;i++){
            if(street.charAt(i)=='H'){
                if(i+1<len && street.charAt(i+1)=='.'){
                    buckets++;
                    i+=2;
                }
                else if(i-1>=0 && street.charAt(i-1)=='.'){
                    buckets++;
                }
                else{
                    return -1;
                }
            }
        }
        return buckets;
    }
}
