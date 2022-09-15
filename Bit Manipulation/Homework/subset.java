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
		int subset = 1<<n;
		for(int i=0;i<subset;i++){
		    int pos=n-1;
		    int mask=i;
		    while(mask>0){
		        if((mask&1)==1){
		            System.out.print(arr[pos]+" ");
		        }
		    mask=mask>>1;
		    pos--;
		    }
		    System.out.println();
		}
	}
}
