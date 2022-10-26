import java.util.*;
class Node{
    int data;
    Node next;
}
class Queue{
   Node front=null,rear=null;
   //Insert at the end 
   public void enqueue(int data){
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = null;
       if(rear==null){
           rear=newNode;
           front=newNode;
       }
       else{
           Node temp=rear;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=newNode;
           front=newNode;
       }
   }
   //delete at the beginning
   public int dequeue(){
       int val=0;
       if(rear!=null){
           val=rear.data;
           rear=rear.next;
       }
       return val;
   }
   public int peek(){
       return rear.data;
   }
   public void display(){
       Node temp=rear;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
   }
}
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int data = scanner.nextInt();
            queue.enqueue(data);
        }
        queue.display();
        System.out.println("\nThe popped element is "+queue.dequeue());
        queue.display();
        System.out.println("\nThe peek element is "+queue.peek());
    }
}
