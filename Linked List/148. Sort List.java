class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        //To find the middle element
        ListNode temp=null;
        ListNode slowptr = head;
        ListNode fastptr = head;
        while(fastptr!=null && fastptr.next!=null){
            temp=slowptr;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        temp.next=null;
        //slowptr points the middle position
        ListNode left = sortList(head);
        ListNode right = sortList(slowptr);
        return Merge(left,right);
    }
    public static ListNode Merge(ListNode left,ListNode right){
        ListNode head=new ListNode(),temp=head;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        return head.next;
    }
}
