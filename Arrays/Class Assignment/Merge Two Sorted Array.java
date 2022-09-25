import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n1 = scanner.nextInt();
	    int n2 = scanner.nextInt();
	    int[] a1 = new int[n1];
	    int[] a2 = new int[n2];
	    int n =n1+n2;
	    int[] a = new int[n];
	    for(int i=0;i<n1;i++){
	        a1[i]=scanner.nextInt();
	    }
	    for(int i=0;i<n2;i++){
	        a2[i]=scanner.nextInt();
	    }
	    int i=0,j=0,k=0;
	    while(i<n1 && j<n2){
	        if(a1[i]<a2[j]){
	            a[k++]=a1[i++];
	        }
	        else{
	            a[k++]=a2[j++];
	        }
	    }
	    while(i<n1){
	        a[k++]=a1[i++];
	    }
	    while(j<n2){
	        a[k++]=a2[j++];
	    }
	    for(int m=0;m<n;m++){
	        System.out.print(a[m]+" ");
	    }
	}
}
