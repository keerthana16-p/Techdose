import java.util.*;
class Node{
    int data;
    Node next;
}
public class Main{
    public static Node append(int val,Node head){
        Node newnode = new Node();
        newnode.data=val;
        if(head==null){
            head=newnode;
            newnode.next=head;
            return head;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
        return head;
    }
    public static int JosephCircle(Node head,int n,int m){
        Node curr = head,prev=head;
        while(curr.next!=curr){
            int count=1;
            while(count<m){
                prev=curr;
                curr=curr.next;
                count++;
            }
            prev.next=curr.next;
            curr=curr.next;
        }
        return curr.data;
    }
    public static void main(String[] args){
        Node head=null;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i=1;i<=n;i++){
            head=append(i,head);
        }
        System.out.println(JosephCircle(head,n,m));
    }
}
