class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int n1 = (l1==null)?0:l1.val;
            int n2 = (l2==null)?0:l2.val;
            int sum = n1+n2+carry;
            carry=sum/10;
            ListNode nn = new ListNode();
            nn.val = sum%10;
            nn.next=null;
            temp.next=nn;
            temp=temp.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return head.next;
    }
}
