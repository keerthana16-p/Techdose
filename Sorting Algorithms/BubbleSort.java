import java.util.Scanner;
public class Main
{   
    public static void Swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void BubbleSort(int[] arr,int n){
        boolean isSwapped;
        for(int i=n-1;i>=0;i--){
            isSwapped=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    Swap(arr,j,j+1);
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
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
		BubbleSort(arr,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}


