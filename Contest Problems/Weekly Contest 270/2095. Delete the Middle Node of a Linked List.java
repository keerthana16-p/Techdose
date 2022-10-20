class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode prev=null,slowptr=head,fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            prev=slowptr;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        prev.next=slowptr.next;
        return head;
    }
}
