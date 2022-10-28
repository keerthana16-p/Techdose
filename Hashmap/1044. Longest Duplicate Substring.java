class Solution {
    public String longestDupSubstring(String s) {
        int left=1,right=s.length()-1;
        String res="";
        while(left<=right){
            int mid=left+(right-left)/2;
            String str=duplicateString(s,mid);
            if(str==null){
                right=mid-1;
            }
            else{
               res=str;
               left=mid+1;
            }
        }
        return res;        
    }
    public static String duplicateString(String s,int mid){
        long hash = hash(s.substring(0,mid),mid);
        long power= 1;
        Set<Long> set = new HashSet<>();
        set.add(hash);
        for(int i=1;i<mid;i++){
            power*=31;
        }
        for(int i=1;i<=s.length()-mid;i++){
            hash = nextHash(hash,s.charAt(i-1),s.charAt(i+mid-1),power);
            if(!set.add(hash)){
                return s.substring(i,i+mid);
            }
            else{
                set.add(hash);
            }
        }
        return null;
    }
    public static long hash(String str,int mid){
        long hash=0,a=1;
        for(int i=mid-1;i>=0;i--){
            hash+=(str.charAt(i)-'a'+1)*a;
            a*=31;
        }
        return hash;
    }
    public static long nextHash(long hash,char left,char right,long power){
        return ((hash-(left-'a'+1)*power)*31)+(right-'a'+1);
    }
}
