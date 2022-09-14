import java.util.Scanner;
public class Main
{   
    public static boolean isPrime(int n){
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n= scanner.nextInt();
	 for(int i=1;i*i<=n;i++){
	     if(n%i==0 && isPrime(i)==true){
	         System.out.print(i+" ");
	         if((n/i)!=i && isPrime(n/i)){
	             System.out.print(n/i+" ");
	         } 
	     }
	 }
	}
}
