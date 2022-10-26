import java.util.*;
class Node{
    int data;
    Node next;
}
class Stack{
    //top acts like a head
    Node top=null;
    //insert at the beginning 
    public void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next=null;
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    //delete at the beginning
    public int pop(){
        int data=0;
        if(top!=null){
            data=top.data;
            top=top.next;
        }
        return data;
    }
    public int peek(){
        if(top!=null){
            return top.data;
        }
        return 0;
    }
    public void display(){
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
        Stack stack = new Stack();
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int val = scanner.nextInt();
            stack.push(val);
        }
        System.out.println("Popped element is "+stack.pop());
        stack.display();
        System.out.println("\nTop element is "+stack.peek());
    }
}
