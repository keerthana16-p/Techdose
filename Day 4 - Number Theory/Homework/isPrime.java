import java.util.Scanner;
public class Main
{   
    public static boolean isPrime1(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime2(int n){
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
	 System.out.println(isPrime1(n));
	 System.out.println(isPrime2(n));
	}
}
