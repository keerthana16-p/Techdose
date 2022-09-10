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
		int max=arr[0],secmax=arr[0];
		for(int i=0;i<n;i++){
		    if(arr[i]>max){
		        secmax=max;
		        max=arr[i];
		    }
		}
		System.out.println(secmax);
	}
}
