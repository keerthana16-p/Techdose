import java.util.Scanner;
public class Main
{   public static void mean(int[] arr,int  n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum/n);
    }
    public static void median(int[] arr,int n){
        int mid = n/2;
        if(n%2!=0){
            System.out.println(arr[mid]);
        }
        else{
            System.out.println((arr[mid]+arr[mid+1])/2);
        }
    }
    public static void mode(int arr[] ,int n){
        int max=arr[0],maxcount=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            if(count>maxcount){
                maxcount=count;
                max=arr[i];
            }
        }
        System.out.println(max);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=scanner.nextInt();
	    }
	    //Mean=>sum of elements/total Number
	    //Median=>middle element when N is odd and average of middle two elements when N is even.
	    //Mode=>most frequently occuring element on the array.
	    mean(arr,n);
	    median(arr ,n);
	    mode(arr,n);
	}
}
