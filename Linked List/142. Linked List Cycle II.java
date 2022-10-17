public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        while(slowptr!=null && fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                slowptr=head;
                while(slowptr!=fastptr){
                    slowptr=slowptr.next;
                    fastptr=fastptr.next;
                }
                return slowptr;
            } 
        }
        return null;
    }
}
