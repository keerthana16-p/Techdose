import java.util.Scanner;
public class Main
{   
    public static int OneComplement(int n){
        return (~n);
    } 
    public static int TwoComplement(int n){
        return (~n)+1;
    } 
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 System.out.println("One's Compliment is "+OneComplement(n));
	 System.out.println("Two's Compliment is "+TwoComplement(n));
	}
}
