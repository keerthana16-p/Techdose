//Largest subarray with sum<=target
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=scanner.nextInt();
	    }
	    int target = scanner.nextInt();
	    int sum=0,left=0,right=0,max=0;
	    while(right<n){
	        while(right<n && sum<target){
	            sum=sum+a[right++];
	        }
	        if(max<(right-left)){
	            max=right-left;
	        }
	        while(sum>=target){
	            sum=sum-a[left++];
	        }
	    }
	    System.out.println(max);
	}
}
