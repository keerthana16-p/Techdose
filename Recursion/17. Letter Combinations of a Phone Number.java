class Solution {
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
      Map<Integer,String[]> map = new HashMap<>();
      map.put(2,new String[]{"a","b","c"});
      map.put(3,new String[]{"d","e","f"});
      map.put(4,new String[]{"g","h","i"});
      map.put(5,new String[]{"j","k","l"});
      map.put(6,new String[]{"m","n","o"});
      map.put(7,new String[]{"p","q","r","s"});
      map.put(8,new String[]{"t","u","v"});
      map.put(9,new String[]{"w","x","y","z"});
      generate(map,digits,0,"");
      return res;
    }
   public void generate(Map<Integer,String[]> map,String digits,int index,String str){
       if(index==digits.length()){
           if(str.length()>0){
               res.add(str);
           }
           return;
       }
       String[] temp = map.get(digits.charAt(index)-'0');
       for(int i=0;i<temp.length;i++){
           generate(map,digits,index+1,str+temp[i]);
       }
   }
}
