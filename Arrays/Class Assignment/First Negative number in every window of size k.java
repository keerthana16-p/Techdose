import java.util.*;
public class Main
{  
    public static void FirstNegative(int arr[],int k){
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int[] res = new int[arr.length-k+1];
        int index=0,right=0;
        while(right<arr.length){
            if(!deque.isEmpty() && right-k==deque.getFirst()){
                deque.removeFirst();
            }
            if(arr[right]<0){
                deque.add(right);
            }
            if(!deque.isEmpty() && right>=k-1){
                res[index++]=arr[deque.getFirst()];
            }
            right++;
        }
        for(int i=0;i<index;i++){
            System.out.println(res[i]);
        }
    }
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     int n = scanner.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i<n;i++){
	         arr[i]=scanner.nextInt();
	     }
	     int k = scanner.nextInt();
	     FirstNegative(arr,k);
	}
}
