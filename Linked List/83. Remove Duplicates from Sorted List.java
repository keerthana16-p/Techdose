class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=head,temp=head.next;
        while(temp!=null){
            if(prev.val!=temp.val){
                prev.next=temp;
                prev=prev.next;
                temp=temp.next;
            }
            else{
                temp=temp.next;
            }
        }
        prev.next=null;
        return head;
    }
}
