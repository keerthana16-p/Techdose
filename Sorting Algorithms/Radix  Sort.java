import java.util.Scanner;
public class Main
{   
    public static void CountSort(int arr[],int len,int exp){
        int[] frequency = new int[10];
        int[] cumulativeFrequency = new int[10];
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            frequency[(arr[i]/exp)%10]++;
        }
        cumulativeFrequency[0]=frequency[0];
        for(int i=1;i<10;i++){
            cumulativeFrequency[i]=frequency[i]+cumulativeFrequency[i-1];
        }
        for(int i=len-1;i>=0;i--){
            int ind = cumulativeFrequency[(arr[i]/exp)%10]-1;
            cumulativeFrequency[(arr[i]/exp)%10]--;
            res[ind]=arr[i];
        }
        for(int i=0;i<len;i++){
            arr[i]=res[i];
        }
    }
    public static int getMax(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void RadixSort(int arr[],int n){
        int max=getMax(arr,n);
        for(int exp=1;max/exp>0;exp*=10){
            CountSort(arr,n,exp);
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		RadixSort(arr,arr.length);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}

