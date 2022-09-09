import java.util.Scanner;
public class Main
{   
    public static void Merge(int[] arr,int low,int mid,int high,int n){
        int[] res= new int[n];
        int k=low,i=low,j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                res[k++]=arr[i];
                i++;
            }
            else{
                res[k++]=arr[j];
                j++;
            } 
        }
        while(i<=mid){
            res[k++]=arr[i];
            i++;
        }
        while(j<=high){
            res[k++]=arr[j];
            j++;
        }
        for(i=low;i<=high;i++){
            arr[i]=res[i];
        }
    }
    public static void MergeSort(int[] arr,int low,int high,int n){
        if(low==high){
            return ;
        }
        //for single element
        int mid=low+(high-low)/2;
        MergeSort(arr,low,mid,n);
        MergeSort(arr,mid+1,high,n);
        Merge(arr,low,mid,high,n);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		MergeSort(arr,0,n-1,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}


