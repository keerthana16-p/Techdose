import java.util.Scanner;
public class Main
{   
    public static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    public static int LCM(int a,int b){
        return (a/GCD(a,b))*b;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(LCM(a,b));
	}
}
