class Solution {
    List<String> res = new ArrayList<>();
    Set<String> set = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int n = invalidParenthesis(s);
        remove(s,n);
        return res;
    }
    public int invalidParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.add(s.charAt(i));
                }
            }
        }
        return stack.size();
    }
    public void remove(String s,int n){
        if(set.contains(s)){
            return;
        }
        else{
            set.add(s);
        }
        if(n<0){
            return;
        }
        if(n==0){
            if(invalidParenthesis(s)==0){
                res.add(s);
                return;
            }
        }
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i);
            String right = s.substring(i+1);
            remove(left+right,n-1);
        }
    }
}
