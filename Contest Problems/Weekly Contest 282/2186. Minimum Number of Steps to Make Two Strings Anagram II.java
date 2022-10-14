class Solution {
    public int minSteps(String s, String t) {
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        for(int i=0;i<s.length();i++){
            str1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            str2[t.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(str1[i]!=0){
                count+=Math.abs(str1[i]-str2[i]);
                str1[i]=0;
                str2[i]=0;
            }
            if(str2[i]!=0){
                count+=Math.abs(str1[i]-str2[i]);
            }
        }
        return count;
    }
}
