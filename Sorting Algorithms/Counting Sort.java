import java.util.Scanner;
public class Main
{   
    public static void CountSort(int arr[]){
        int len = arr.length;
        int[] frequency = new int[10];
        int[] cumulativeFrequency = new int[10];
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            frequency[arr[i]]++;
        }
        cumulativeFrequency[0]=frequency[0];
        for(int i=1;i<10;i++){
            cumulativeFrequency[i]=frequency[i]+cumulativeFrequency[i-1];
        }
        for(int i=len-1;i>=0;i--){
            int ind = cumulativeFrequency[arr[i]]-1;
            cumulativeFrequency[arr[i]]--;
            res[ind]=arr[i];
        }
        for(int i=0;i<len;i++){
            arr[i]=res[i];
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		CountSort(arr);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}

