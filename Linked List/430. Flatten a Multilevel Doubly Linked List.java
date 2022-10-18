class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node curr = head;
        while(curr!=null){
            if(curr.child!=null){
                Node tail = curr.child;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=curr.next;
                if(curr.next!=null){
                    curr.next.prev=tail;
                }
                curr.next=curr.child;
                curr.child.prev=curr;
                curr.child=null;
            }
            curr=curr.next;
        }
        return head;
    }
}
