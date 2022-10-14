class Solution {
    public int countCollisions(String directions) {
       int collisions=0;
       Stack<Character> stack = new Stack();
       stack.push(directions.charAt(0));
       for(int i=1;i<directions.length();i++){
           char curr = directions.charAt(i);
           if(stack.peek()=='R' && curr=='L'){
               collisions+=2;
               curr='S';
               stack.pop();
           }
           else if(stack.peek()=='S' && curr=='L' ){
               collisions+=1;
               curr='S';
               stack.pop();
           }
           while(!stack.isEmpty() && (stack.peek()=='R' && curr=='S')){
               stack.pop();
               collisions+=1;
           }
           stack.push(curr);
       }
        return collisions;
    }
}
