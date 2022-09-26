import java.util.Scanner; 
public class Main
{   
    public static int QuickSelect(int[] a,int low,int high,int k){
        int val=0;
        if(low<high){
        int partition = Partition(a,low,high);
        if(partition+1 == k){
            val = a[partition];
        }
        else if(k<partition+1){
            QuickSelect(a,low,partition-1,k);
        }
        else if(k>partition+1){
            QuickSelect(a,partition+1,high,k);
        }
        }
        return val;
    }
    public static int Partition(int[] a,int low,int high){
        int i=low-1,pivot=a[high];
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[high];
        a[high]=a[i+1];
        a[i+1]=temp;
        return i+1;
    }
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=scanner.nextInt();
	    }
	    int k = scanner.nextInt();
	    int value = QuickSelect(a,0,n-1,k);
	    System.out.println(value);
	}
}
