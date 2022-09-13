import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 if((n&(n-1))==0){
	     System.out.println("It is power of 2");
	 }
	 else{
	     System.out.println("It is not a power of 2");
	 }
	}
}
