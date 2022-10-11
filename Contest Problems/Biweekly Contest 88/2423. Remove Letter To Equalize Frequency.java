class Solution {
    public boolean equalFrequency(String word) {
        int[] fre = new int[26];
        int[] count = new int[10000000];
        int len = word.length();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            fre[word.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(fre[i]!=0){
              count[fre[i]]++;
            }
        }
        for(int i=0;i<=999999;i++){
            if(max<count[i]){
                max=i;
            }
        }
        System.out.println(max);
        int flag=0,check=0;
        boolean res=true;
        for(int i=0;i<26;i++){
            if(fre[i]!=0 && fre[i]!=max){
                if(flag==0 && (fre[i]-1==max || fre[i]-1==0)){
                    fre[i]--;
                    flag=1;
                    check=1;
                }
                else if(fre[i]!=max){
                    res=false;
                    check=1;
                }
            }
        }
        if(check == 0 && fre[word.charAt(0)-'a']!=1){
            res=false;
        }
        return res;
    }
}
