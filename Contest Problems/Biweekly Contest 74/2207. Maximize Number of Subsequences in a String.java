class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long ans=0,max=0;
        int count=1;
        //Assume pattern's 0th character is added to the beginning ->maximum subsequence
        for(int i=0;i<text.length();i++){
             if(text.charAt(i)==pattern.charAt(1)){
                ans+=count;
            }
            if(text.charAt(i)==pattern.charAt(0)){
                count+=1;
            }
        }
        max=Math.max(max,ans);
        ans=0;
        count=1;
       //Assume pattern's 1st character is added to the beginning ->maximum subsequence
        for(int i=text.length()-1;i>=0;i--){
            if(text.charAt(i)==pattern.charAt(0)){
                ans+=count;
            }
            if(text.charAt(i)==pattern.charAt(1)){
                count+=1;
            }
        }
        return Math.max(max,ans);
    }
}
