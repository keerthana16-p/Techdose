class Solution {
    public long countVowels(String word) {
        long count =0;
        for(int i=0;i<word.length();i++){
            if("aeiou".indexOf(word.charAt(i))>=0){
                count+=(i+1)*((long)word.length()-i);
            }
        }
        return count;
    }
}
