import java.util.*;
class Node{
    int data;
    Node next,prev;
}
class LinkedList{
    Node head=null;
    public void insertAtBeginning(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        newNode.prev=null;
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        newNode.prev=null;
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public void insertAtMiddle(int data,int pos){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;
        if(pos==1){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        else{
            Node temp=head;
            int p=1;
            while(p!=pos-1){
                temp=temp.next;
                p++;
            }
            newNode.next=temp.next;
            newNode.prev=temp;
            temp.next=newNode;
            newNode.next.prev=newNode;
        }
    }
    public void deleteAtBeginning(){
        if(head!=null){
            head.next.prev=null;
            head=head.next;
        }
    }
    public void deleteAtEnd(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }
    public void deleteAtMiddle(int pos){
        Node temp=head;
        int p=1;
        while(p!=pos){
            temp=temp.next;
            p++;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Main{
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeginning(60);
        linkedList.insertAtBeginning(70);
        linkedList.insertAtEnd(80);
        linkedList.insertAtMiddle(90,2);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(30);
        linkedList.display();
        linkedList.deleteAtBeginning();
        linkedList.deleteAtEnd();
        linkedList.deleteAtMiddle(2);
        linkedList.display();
    }
}
