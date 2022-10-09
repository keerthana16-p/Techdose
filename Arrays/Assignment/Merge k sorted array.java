import java.util.*;
public class Main
{   
    public static void MergeSort(int[] arr,int low,int high){
        if(low==high){
            return;
        }
        int mid = low+(high-low)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,mid,high); 
    }
    public static void Merge(int[] arr,int low ,int mid,int high){
        int[] res = new int[arr.length];
        int i=low,j=mid+1,k=low;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                res[k++]=arr[i++];
            }
            else{
                res[k++]=arr[j++];
            }
        }
        while(i<=mid){
            res[k++]=arr[i++];
        }
        while(j<=high){
            res[k++]=arr[j++];
        }
        for(int m=low;m<=high;m++){
            arr[m]=res[m];
        }
    }
    public static int MergeArray(int[] arr,int[] merge,int start){
        int index=start;
        for(int i=0;i<arr.length;i++){
           merge[index++]=arr[i];
        }
        return index;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,3,4,5};
		int[] arr3 = {4,5,6,7};
		int[] arr4 = {5,6,7};
		int len = arr1.length+arr2.length+arr3.length+arr4.length;
		int[] merge = new int[len];
		int start = MergeArray(arr1,merge,0);
		start=MergeArray(arr2,merge,start);
		start=MergeArray(arr3,merge,start);
		start=MergeArray(arr4,merge,start);
		MergeSort(merge,0,len-1);
		for(int i=0;i<len;i++){
		    System.out.print(merge[i]+" ");
		}
	}
}
