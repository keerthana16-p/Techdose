class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
       int groups=1;
       ListNode temp=head;
       while(temp!=null){
           ListNode start=temp;
           int count=0;
           Stack<Integer> stack = new Stack<>();
           while(count!=groups && temp!=null){
               stack.add(temp.val);
               temp=temp.next;
               count++;
           }
           if(count%2==0){
               while(start!=temp){
                  start.val=stack.pop();
                  start=start.next;
               }
           }
           groups++;
       }
        return head;
    }
}
