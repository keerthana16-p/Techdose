import java.util.*;
class Node{
    int data;
    Node next;
}
class Stack{
    Node top=null;
    public void push(int data){
        Node newnode = new Node();
        newnode.data=data;
        newnode.next=null;
        if(top==null){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }
    public  void pop(){
        top=top.next;
    }
    public void reverse(){
        Node temp=top,prev=null,next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        top=prev;
    }
    public  void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack  stack = new Stack();
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            stack.push(scanner.nextInt());
        }
        stack.display();
        stack.pop();
        stack.display();
        stack.reverse();
        stack.display();
    }
}
