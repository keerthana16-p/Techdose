class Solution {
    public int calculate(String s) {
        if(s==null){
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int curnum=0;
        char operation='+';
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                curnum=(curnum*10)+(ch-'0');
            }
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i==s.length()-1){
                if(operation=='+'){
                    stack.push(curnum);
                }
                else if(operation=='-'){
                    stack.push((-1)*curnum);
                }
                else if(operation=='*'){
                    stack.push(stack.pop()*curnum);
                }
                else if(operation=='/'){
                    stack.push(stack.pop()/curnum);
                }
                operation=ch;
                curnum=0;
            }
        }
        int res=0;
        while(!stack.empty()){
            res+=stack.pop();
        }
        return res;
    }
}
