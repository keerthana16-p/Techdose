import java.util.Scanner;
public class Main
{   
    public static int setIthbit(int n,int i){
       return (n|(1<<(i-1)));
    }
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 int i = scanner.nextInt();
	 System.out.println("After Setting Ith bit is "+setIthbit(n,i));
	}
}
