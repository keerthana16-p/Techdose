class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
       int[] phash = new int[26];
       int[] hash = new int[26];
       if(s.length()<p.length()){
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
            if(Arrays.equals(hash,phash)){
                list.add(left+1);
            }
            left++;
            right++;
        }
        return list;
    }
}
