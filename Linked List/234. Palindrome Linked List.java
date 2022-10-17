class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int mid = n/2;
        ListNode rev=null,prev=null,next=null,head1=null;
        temp = head;
        while(mid!=0){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            mid--;
        }
        rev=prev;
        head1=temp;
        if(n%2!=0){
            head1=head1.next;
        }
        while(head1!=null){
            if(head1.val != rev.val){
                return false;
            }
            head1=head1.next;
            rev=rev.next;
        }
        return true;
    }
}
