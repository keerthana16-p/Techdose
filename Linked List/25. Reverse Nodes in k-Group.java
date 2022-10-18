class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode();
        res.next=head;
        ListNode ptr = res;
        while(ptr!=null){
            ListNode temp = ptr;
            for(int i=0;i<k && temp!=null ;i++){
                temp=temp.next;
            }
            if(temp==null){
                break;
            }
            ListNode curr = ptr.next,prev=null,next=null;
            for(int i=0;i<k;i++){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode tail = ptr.next;
            tail.next=curr;
            ptr.next =prev;
            ptr= tail;
        }
        return res.next;
    }
}
