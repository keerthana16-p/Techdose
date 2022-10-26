import java.util.*;
class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head=null;
    public void insertAtBeginning(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null){
            newNode.next=newNode;
            head=newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null){
            newNode.next=newNode;
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public void insertAtMiddle(int data,int pos){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(pos==1){
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
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
            temp.next=newNode;
        }
    }
    public void deleteAtBeginning(){
        if(head!=null){
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
        }
    }
    public void deleteAtEnd(){
        Node temp=head,prev=null;
        while(temp.next!=head){
            prev=temp;
            temp=temp.next;
        }
        prev.next=head;
    }
    public void deleteAtMiddle(int pos){
        if(pos==1){
            Node temp = head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
        }
        else{
        Node temp=head,prev=null;
        int p=1;
        while(p!=pos){
            prev=temp;
            temp=temp.next;
            p++;
        }
        prev.next=temp.next;
        }
    }
    public void display(){
        System.out.print(head.data+" ");
        Node temp=head.next;
        while(temp!=head){
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
        linkedList.display();
        linkedList.deleteAtEnd();
        linkedList.display();
        linkedList.deleteAtMiddle(2);
        linkedList.display();
    }
}
