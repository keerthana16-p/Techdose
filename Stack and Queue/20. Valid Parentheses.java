class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s.length()==1){
            return false;
        }
        int len = s.length(),i=0;
        while(i<len){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(!stack.empty()){
                char ch=stack.peek();
                if(s.charAt(i)==')' && ch=='('){
                    stack.pop();
                }
                else if(s.charAt(i)==']' && ch=='['){
                    stack.pop();
                }
                else if(s.charAt(i)=='}' && ch=='{'){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        i++;
        }
    if(!stack.empty()){
        return false;
    }
    return true;
    }
}
