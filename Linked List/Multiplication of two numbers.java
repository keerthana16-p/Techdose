import java.util.*;
class Node{
    int data;
    Node next;
}
public class Main{
    public static Node append(int val,Node head){
        Node newnode = new Node();
        newnode.data=val;
        newnode.next=null;
        if(head==null){
            return newnode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void multiply(Node l1,Node l2){
        int n1=0,n2=0,mul;
        while(l1!=null){
            n1=(n1*10)+l1.data;
            l1=l1.next;
        }
        while(l2!=null){
            n2=(n2*10)+l2.data;
            l2=l2.next;
        }
        mul=n1*n2;
        Node res=null;
        while(mul>0){
            Node nn = new Node();
            nn.data=mul%10;
            nn.next=null;
            mul=mul/10;
            if(res==null){
                res=nn;
            }
            else{
                nn.next=res;
                res=nn;
            }
        }
        display(res);
    }
    public static void main(String[] args){
        Node l1=null,l2=null;
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        for(int i=0;i<n1;i++){
            int val = scanner.nextInt();
            l1=append(val,l1);
        }
        int n2 = scanner.nextInt();
        for(int i=0;i<n2;i++){
            int val = scanner.nextInt();
            l2=append(val,l2);
        }
        multiply(l1,l2);
    }
}
