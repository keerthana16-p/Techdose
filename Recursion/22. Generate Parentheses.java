class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list,n,n,"");
        return list;
    }
    public void generate(List<String> list,int left,int right,String str){
        if(left==0 && right==0){
            list.add(str);
            return ;
        }
        if(left>0){
            generate(list,left-1,right,str+'(');
        }
        if(left<right){
            generate(list,left,right-1,str+')');
        }
    }
}
