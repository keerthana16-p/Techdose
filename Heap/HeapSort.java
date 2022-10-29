import java.util.*;
class Minheap{
    static int maxSize,size;
    static int[] heap;
    Minheap(int n){
        this.maxSize=n;
        heap=new int[n+1];
        size=0;
    }
    public static void heapSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(pop()+" ");
        }
    }
    public static void push(int data){
        int ind = size+1;
        heap[ind]=data;
        while(ind>1 && heap[ind/2]>heap[ind]){
            swap(ind,ind/2);
            ind=ind/2;
        }
        size+=1;
    }
    public static int pop(){
        int del = heap[1];
        heap[1]=heap[size];
        heapify(1);
        size-=1;
        return del;
    }
    public static void heapify(int root){
        int left = 2*root;
        int right = (2*root)+1;
        int min = root;
        if(left<size && heap[left]<heap[min]){
            min=left;
        }
        if(right<size && heap[right]<heap[min]){
            min=right;
        }
        if(min!=root){
            swap(min,root);
            heapify(min);
        }
    }
    public static void swap(int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Minheap minheap = new Minheap(n);
        minheap.heapSort(arr);
    }
}
