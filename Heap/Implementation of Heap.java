import java.util.*;
public class Main{
    static int maxSize;
    static int size;
    static int[] heap;
    Main(int s){
        heap=new int[s+1];
        maxSize=s;
        size=0;
    }
    public static void swap(int[] heap,int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
    public static void heapify(int[] heap,int root){
        int left = (2*root);
        int right = (2*root)+1;
        int max=root;
        if(left<=size && heap[left]>heap[max]){
            max=left;
        }
        if(right<=size && heap[right]>heap[max]){
            max=right;
        }
        if(max!=root){
        swap(heap,max,root);
        heapify(heap,max);
        }
    }
    public static void heapPush(int[] heap,int data){
        int ind = size+1;
        heap[ind]=data;
        while(ind > 1 && heap[ind/2]<heap[ind]){
            swap(heap,ind/2,ind);
            ind=ind/2;
        }
        size+=1;
    }
    public static int heapPop(int[] heap){
        if(size==0){
            System.out.println("Underflow");
            return 0;
        }
        int del = heap[1];
        heap[1] = heap[size];
        size-=1;
        heapify(heap,1);
        return del;
    }
    public static void increaseKey(int[] heap,int index,int diff){
        if(diff<0){
            System.out.println("Invalid");
            return;
        }
        heap[index]=heap[index]+diff;
        while(index>1 && heap[index/2]<heap[index]){
            swap(heap,index/2,index);
            index=index/2;
        }
    }
    public static void decreaseKey(int[] heap,int index,int diff){
        heap[index]=heap[index]-diff;
        heapify(heap,index);
    }
    public static void heapDisplay(int[] heap){
        for(int i=1;i<=size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int s= scanner.nextInt();
        Main obj=new Main(s);
        for(int i=0;i<maxSize;i++){
            int val = scanner.nextInt();
            obj.heapPush(heap,val);
             //obj.heapDisplay(heap);
        }
        obj.heapDisplay(heap);
        System.out.println(heapPop(heap));
        heapDisplay(heap);
        int in = scanner.nextInt();
        int indiff = scanner.nextInt();
        increaseKey(heap,in,indiff);
        heapDisplay(heap);
        int de = scanner.nextInt();
        int dediff = scanner.nextInt();
        decreaseKey(heap,de,dediff);
        heapDisplay(heap);
    }
}
