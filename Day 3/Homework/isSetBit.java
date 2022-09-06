import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 int pos = scanner.nextInt();
	 if((n&(1<<(pos-1)))!=0){
	 System.out.println("It is a set bit");
	 }
	 else{
	     System.out.println("It is not a set bit");
	 }
	}
}
