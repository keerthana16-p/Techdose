class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int i=0,j=0;
         while(i<s.length()){
            if(j<spaces.length && i==spaces[j]){
                str.append(" ");
                j++;
            }
            str.append(s.charAt(i));
            i++;
        }
        return str.toString();
    }
}
