class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set = new HashSet<>();
      if(s.length()==0){
          return 0;
      }
      int start=0,end=0,max=Integer.MIN_VALUE;
      while(start<s.length()){
          if(set.size()==0){
              set.add(s.charAt(start));
          }
          else if(set.contains(s.charAt(start))==false){
              set.add(s.charAt(start));
          }
          else if(set.contains(s.charAt(start))==true){
              if(s.charAt(start)==s.charAt(end)){
                  set.remove(s.charAt(end));
                  end++;
                  set.add(s.charAt(start));
              }
              else{
                  while(s.charAt(start)!=s.charAt(end)){
                      set.remove(s.charAt(end));
                      end++;
                  }
                  set.remove(s.charAt(end));
                  end++;
                  set.add(s.charAt(start));
              }
          }
          if(set.size()>max){
              max=set.size();
          }
          start++;
      }
        return max;
        }
    }
