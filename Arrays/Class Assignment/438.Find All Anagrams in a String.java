//Annagram => All letters in word is taken using those letters another word is created
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] phash = new int[26];
        int[] hash = new int[26];
        List<Integer> list = new ArrayList<Integer>();
        if(p.length()>s.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            phash[p.charAt(i)-'a']++;
            hash[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(phash,hash)){
                list.add(0);
         }
        int left=0,right=p.length();
        while(right<s.length()){
            hash[s.charAt(left)-'a']--;
            hash[s.charAt(right)-'a']++;
            if(Arrays.equals(phash,hash)){
                list.add(left+1);
            }
            left++;
            right++;
        }
        return list;
    }
}
