//To find the maximum of minimum element in each subarray of size k
import java.util.*;
public class Main{
    public static int MaximumOfMinimum(int arr[],int k){
        Deque<Integer> deque=new ArrayDeque<Integer>();
        List<Integer> min = new ArrayList<Integer>();
        int index=0,right=0;
        while(right<arr.length){
            if(!deque.isEmpty() && right-k==deque.getFirst()){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[right]<arr[deque.getLast()]){
                deque.removeLast();
            }
            deque.add(right);
            if(right>=k-1){
                min.add(arr[deque.getFirst()]);
            }
            right++;
        }
        int max=Collections.max(min);
        return max;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int k =scanner.nextInt();
        System.out.println(MaximumOfMinimum(arr,k));
    }
}
