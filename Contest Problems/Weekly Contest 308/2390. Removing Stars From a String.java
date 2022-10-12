class Solution {
    public String removeStars(String s) {
        StringBuilder res=new StringBuilder();
        int len=s.length();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch!='*'){
                list.add(ch);
            }
            else if(ch=='*'){
                list.remove(list.size()-1);
            }
        }
        System.out.println(list);
        for(Character val:list){
            res=res.append(val);
        }
        return res.toString();
    }
}
