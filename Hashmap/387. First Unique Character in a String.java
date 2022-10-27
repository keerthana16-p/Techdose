class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        int len = s.length(),index=0;
        while(index<len){
            char ch = s.charAt(index);
            if(map.containsKey(ch)==true){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            index++;
        }
        int res=-1;
        for(char ch:map.keySet()){
            if(map.get(ch)==1){
                res=s.indexOf(ch);
                break;
            }
        }
        return res;
    }
}
