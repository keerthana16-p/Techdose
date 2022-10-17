import java.util.*;
//Creating a Node 
class Node{
    int data;
    Node next;
}
public class Main{
    public static Node append(Node head,int val){
        Node newnode = new Node();
        newnode.data=val;
        newnode.next=null;
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node head=null;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int val = scanner.nextInt();
            head=append(head,val);
        }
        display(head);
    }
}
