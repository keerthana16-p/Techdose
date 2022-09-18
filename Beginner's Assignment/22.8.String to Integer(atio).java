class Solution {
    public int myAtoi(String s) {
      int res=0,i=0,sign=1;
      while(i<s.length() && s.charAt(i)==' '){
              i++;
         }
        if(i>=s.length()){
            return 0;
        }
       if(s.charAt(i)=='+' || s.charAt(i)=='-'){
          sign=s.charAt(i)=='-'?-1:1;
          i++;
       }
        if(i>=s.length()){
            return 0;
        }
       while(i<s.length() && s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
           if((res>Integer.MAX_VALUE/10)|| (res==Integer.MAX_VALUE/10 )&& (s.charAt(i)-'0'>Integer.MAX_VALUE%10)){
               return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
           }
              res=(res*10)+(s.charAt(i)-'0');
              i++;
       }
        return res*sign;
    }
}
