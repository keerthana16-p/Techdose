class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode head = lists[i];
            while(head!=null){
                minheap.add(head.val);
                head=head.next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(minheap.size()>0){
            ListNode nn = new ListNode(minheap.poll());
            temp.next=nn;
            temp=nn;
        }
        return head.next;
    }
}
