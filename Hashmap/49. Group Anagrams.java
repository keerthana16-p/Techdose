class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> result = new ArrayList<>();
      Map<String,List<String>> map = new HashMap<>();
      for(int i=0;i<strs.length;i++){
          char[] str = strs[i].toCharArray();
          Arrays.sort(str);
          String s1 = new String(str);
          if(map.containsKey(s1)){
              map.get(s1).add(strs[i]);
          }
          else{
              List<String> list = new ArrayList();
              list.add(strs[i]);
              map.put(s1,list);
          }
      }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
