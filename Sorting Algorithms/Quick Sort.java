import java.util.Scanner;
public class Main
{   
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            QuickSort(arr,low,partitionIndex-1);
            QuickSort(arr,partitionIndex+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		QuickSort(arr,0,n-1);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}

