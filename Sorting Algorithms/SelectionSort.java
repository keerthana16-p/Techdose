import java.util.Scanner;
public class Main
{   
    public static void Swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void SelectionSort(int[] arr,int n){
         int minind;
         for(int i=0;i<n-1;i++){
             minind=i;
             for(int j=i+1;j<n;j++){
                 if(arr[minind]>arr[j]){
                     minind=j;
                 }
             }
             Swap(arr,minind,i);
         }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		SelectionSort(arr,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}

