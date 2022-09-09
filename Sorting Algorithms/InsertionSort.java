import java.util.Scanner;
public class Main
{   
    public static void Swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void InsertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>arr[j-1]){
                    break;
                }
                Swap(arr,j,j-1);
            }
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		InsertionSort(arr,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}


