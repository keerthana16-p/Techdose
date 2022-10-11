class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int len = s.length();
        boolean[] count = new boolean[26];
        int i=0,c=0;
        boolean flag=false;
        while(i<len){
            char ch = s.charAt(i);
            int pos=distance[(int)(ch-'a')];
            if(count[(int)(ch-'a')]==false && i+pos+1<len && s.charAt(i+pos+1)==ch){
                c=c+1;
            }
            count[(int)(ch-'a')]=true;
            i++;
        }
        if(c==len/2){
            flag=true;
        }
        return flag;
    }
}
