class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        if(s.length()==0){
            return 0;
        }
        int max=Integer.MIN_VALUE,start=0,end=0;
        while(start<s.length()){
            if(set.isEmpty()==true){
                set.add(s.charAt(start));
            }
            else if(set.contains(s.charAt(start))==false){
                set.add(s.charAt(start));
            }
            else if(set.contains(s.charAt(start))==true){
                if(s.charAt(start)==s.charAt(end)){
                    set.remove(s.charAt(start));
                    end++;
                    set.add(s.charAt(start));
                }
                else{
                    while(s.charAt(start)!=s.charAt(end) && end <s.length()){
                        set.remove(s.charAt(end));
                        end++;
                    }
                    set.remove(s.charAt(end));
                    end++;
                    set.add(s.charAt(start));
                }
            }
            if(max<set.size()){
                max=set.size();
            }
                start++;
            }
        return max;
        }
    }
