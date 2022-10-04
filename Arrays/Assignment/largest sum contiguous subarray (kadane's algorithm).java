//to find the maximum sum among the sums of the contiguous subarrays
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
	    int maxend=0,maxsofar=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        maxend=maxend+arr[i];
	        if(maxend<arr[i]){
	            maxend=arr[i];
	        }
	        if(maxsofar<maxend){
	            maxsofar=maxend;
	        }
	    }
	    System.out.println(maxsofar);
	}
}
