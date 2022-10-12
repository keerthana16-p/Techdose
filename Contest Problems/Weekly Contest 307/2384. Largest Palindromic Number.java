class Solution {
    public String largestPalindromic(String num) {
        int[] fre = new int[127];
        for(int i=0;i<num.length();i++){
            fre[num.charAt(i)]++;
        }
        String left="";
        StringBuilder right= new StringBuilder();
        int c=0;
        for(int i=0;i<num.length();i++){
            for(char j='9';j>='0';j--){
                c=c+1;
                if(fre[j]>1 && (j>'0' || left.length()>0)){
                    left+=j;
                    right.append(j);
                    fre[j]-=2;
                    break;
                }
            }
        }
        for(char i='9';i>='0';i--){
            if(fre[i]>0){
                left+=i;
                break;
            }
        }
        right.reverse();
        return left+(right.toString());
    }
}
