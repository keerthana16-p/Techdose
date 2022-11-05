class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        generate(s,wordDict,res,cur,0);
        return res;
    }
    public void generate(String s,List<String> wordDict,List<String> res,List<String> cur ,int index){
        for(int i=index+1;i<=s.length();i++){
            String str = s.substring(index,i);
            if(wordDict.contains(str)){
                cur.add(str);
                if(i==s.length()){
                    String ch[] = cur.toArray(String[]::new);
                    res.add(String.join(" ",ch));
                }
                else{
                    generate(s,wordDict,res,cur,i);
                }
                cur.remove(cur.size()-1);
            }
        }
    }
}
